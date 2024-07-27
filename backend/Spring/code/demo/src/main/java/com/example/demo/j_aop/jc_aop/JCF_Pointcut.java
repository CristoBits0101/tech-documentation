package com.example.demo.j_aop.jc_aop;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect     // Hay que indicar que es un aspecto
@Component  // Hay que indicar que es un componente en Spring Boot
public class JCF_Pointcut {

    /**
     * SE USA PARA REUTILIZAR EXPRESIONES REGULARES
     * Para consumirlo: @Around("GreetingServicePointcuts.greetingLoggerPointCut()") "Clase.Method"
     */
    @Pointcut("execution(* com.andres.curso.springboot.app.aop.springbootaop.services.GreetingService.*(..))")
    public void greetingLoggerPointCut() {
    }

    @Pointcut("execution(* com.andres.curso.springboot.app.aop.springbootaop.services.GreetingService.*(..))")
    public void greetingFooLoggerPointCut() {
    }

}
