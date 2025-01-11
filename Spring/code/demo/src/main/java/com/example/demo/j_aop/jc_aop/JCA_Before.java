package com.example.demo.j_aop.jc_aop;

import java.util.Arrays;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;


@Aspect     // Hay que indicar que es un aspecto
@Component  // Hay que indicar que es un componente en Spring Boot
public class JCA_Before {

    // 1. Para imprimir logs
    private Logger logger = LoggerFactory.getLogger(this.getClass());

    /**
     * 2. Configurar el aspecto
     * 
     * Before                      -> Antés
     * execution                   -> Prefijo de la anotación
     * String Package.Clase.Method -> Nombre de la clase a mapear
     * 
     * loggerBefore                -> Se ejecuta antes del metódo
     * JoinPoint                   -> Para enlazar un metódo con el aspecto
     * 
     * getSignature()              -> Referencia a la firma del metódo
     * getName()                   -> Obtiene el nombre del metódo
     * Arrays.toString             -> Convierte una lista en una String
     * getArgs()                   -> Obtiene los parámetros del metódo
     */
    @Before("execution(String com.example.demo.j_aop.jb_service.JBA_GreetingService.sayHello(..))")
    public void loggerBefore(JoinPoint joinPoint) {
        String method = joinPoint.getSignature().getName();
        String args = Arrays.toString(joinPoint.getArgs()) ;
        logger.info("Before method execution: {} with args: {}", method, args);
    }

    // 3. After
    @After("execution(String com.example.demo.j_aop.jb_service.JBA_GreetingService.sayHello(..))")
    public void loggerAfter(JoinPoint joinPoint) {
        String method = joinPoint.getSignature().getName();
        String args = Arrays.toString(joinPoint.getArgs());
        logger.info("Despues: " + method + " con los argumentos " + args);
    }

}
