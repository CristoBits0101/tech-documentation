package com.example.demo.j_aop.jc_aop;

import java.util.Arrays;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Aspect // Hay que indicar que es un aspecto
@Component // Hay que indicar que es un componente en Spring Boot
public class JCF_Around {

    // 1. Para imprimir logs
    private Logger logger = LoggerFactory.getLogger(this.getClass());

    /**
     * 2.0. ProceedingJoinPoint actua sobre el método que se está ejecutando
     * 2.1. Permite lógica antes, después y alrededor de la ejecución métodos.
     * 2.2. Si el método tiene un ProceedingJoinPoint y devuelve un Object, es
     * un @Around advice.
     * 2.3. Si solo tiene JoinPoint y no devuelve, dependiendo de la lógica es:
     * - @Before,
     * - @After,
     * - @AfterReturning,
     * - @AfterThrowing advice
     */
    @Around("GreetingServicePointcuts.greetingLoggerPointCut()")
    public Object loggerAround(ProceedingJoinPoint joinPoint) throws Throwable {

        String method = joinPoint.getSignature().getName();
        String args = Arrays.toString(joinPoint.getArgs());

        Object result = null;
        try {
            logger.info("El metodo " + method + "() con los parametros " + args);
            result = joinPoint.proceed();
            logger.info("El metodo " + method + "() retorna el resultado: " + result);
            return result;
        } catch (Throwable e) {
            logger.error("Error en la llamada del metodo " + method + "()");
            throw e;
        }

    }

}
