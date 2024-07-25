package com.cristobits0101.aop.aop.aop;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;


@Aspect
@Component
public class GreetingServicePointcut {
    @Pointcut("execution(String com.cristobits0101.aop.aop.services.GreetingServiceImpl.sayHello(.. ))")
    private void greetingLoggerPointCut() {
    }
}
