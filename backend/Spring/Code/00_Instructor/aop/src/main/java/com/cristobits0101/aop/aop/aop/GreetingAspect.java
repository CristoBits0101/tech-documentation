package com.cristobits0101.aop.aop.aop;

import java.util.Arrays;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
// import org.aspectj.lang.annotation.Pointcut;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Order(2)
@Aspect
@Component
public class GreetingAspect {

    private Logger logger = LoggerFactory.getLogger(GreetingAspect.class);

    // Para reutilizar una ruta en los after y before
    // @Pointcut("execution(String com.cristobits0101.aop.aop.services.GreetingServiceImpl.sayHello(.. ))")
    // private void greetingLoggerPointCut(){}

    /**
     * Se ejecua al llamar al método de la clase GreetingService sayHello().
     * Se va a ejecutar este método antes de ejecutarse el método.
     * Afecta a todas las clases que implementen la interfaz GreetingService.
     * 
     * @param joinPoint
     */
    @Before("greetingLoggerPointCut")
//  @Before("execution(String com.cristobits0101.aop.aop.services.GreetingServiceImpl.sayHello(.. ))")
//  @Before("execution(String com.cristobits0101.aop.aop.services.GreetingServiceImpl.*(.. ))")
//  @Before("execution(String com.cristobits0101.aop.aop.services.GreetingService.sayHello(.. ))")
//  @Before("execution(* com.cristobits0101.aop.aop.services.GreetingService.sayHello(.. ))")
//  @Before("execution(* com.cristobits0101.aop.aop.services.GreetingService.*(.. ))")
    public void loggerBefore(JoinPoint joinPoint) {
        String method = joinPoint.getSignature().getName();
        String args = Arrays.toString(joinPoint.getArgs());
        logger.info("Antes: " + method + " con los argumentos " + args);
    }

//  @After("execution(* com.cristobits0101.aop.aop.services.GreetingService.*(.. ))")
//  @After("execution(* com.cristobits0101.aop.aop.services.*.*(.. ))")
//  @After("execution(* com.cristobits0101.aop.aop..*.*(.. ))")
    @After("execution(* *.*(.. ))")
    public void loggerAfter(JoinPoint joinPoint) {
        String method = joinPoint.getSignature().getName();
        String args = Arrays.toString(joinPoint.getArgs());
        logger.info("Después: " + method + " con los argumentos " + args);
    }

    @AfterReturning("execution(* *.*(.. ))")
    public void loggerAfterReturning(JoinPoint joinPoint) {
        String method = joinPoint.getSignature().getName();
        String args = Arrays.toString(joinPoint.getArgs());
        logger.info("Después de retornar: " + method + " con los argumentos " + args);
    }

    @AfterThrowing("execution(* *.*(.. ))")
    public void loggerAfterThrowing(JoinPoint joinPoint) {
        String method = joinPoint.getSignature().getName();
        String args = Arrays.toString(joinPoint.getArgs());
        logger.info("Después de una excepción: " + method + " con los argumentos " + args);
    }

    public Object loggerAround(ProceedingJoinPoint joinPoint) throws Throwable {

        String method = joinPoint.getSignature().getName();
        String args = Arrays.toString(joinPoint.getArgs());

        Object result = null;

        try {
            logger.info("El método " + method + " con los argumentos " + args + " se va a ejecutar...");
            result = joinPoint.proceed();
            logger.info("El método " + method + " con los argumentos " + args + " retorna el resultado: " + result);
            return result;
        } catch (Throwable e) {
            logger.error("Error en la llamada del método " + method + "()");
            throw e;
        }

    }

}
