package com.example.demo.j_aop.jc_aop;

import java.util.Arrays;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;


@Aspect     // Hay que indicar que es un aspecto
@Component  // Hay que indicar que es un componente en Spring Boot
public class JCB_After {

    // 1. Para imprimir logs
    private Logger logger = LoggerFactory.getLogger(this.getClass());

    // 2. After
    @After("execution(String com.example.demo.j_aop.jb_service.JBA_GreetingService.sayHello(..))")
    public void loggerAfter(JoinPoint joinPoint) {
        String method = joinPoint.getSignature().getName();
        String args = Arrays.toString(joinPoint.getArgs());
        logger.info("Despues: " + method + " con los argumentos " + args);
    }

}
