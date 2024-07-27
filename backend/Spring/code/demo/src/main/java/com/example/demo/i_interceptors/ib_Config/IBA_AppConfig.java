package com.example.demo.i_interceptors.ib_Config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * 4.1. Hay que registrar el interceptor en una clase de configuración
 * 4.2. Hay que implementar la interface webMvcConfigurer
 */
@Configuration
public class IBA_AppConfig implements WebMvcConfigurer {

    /**
     * 5.1. El interceptor es un componente y lo inyectamos mediante la interface
     * 5.2. Seleccionar nuestro componente porque esta interface tiene varias implementaciones
     */
    @Autowired
    @Qualifier("loadingTimeInterceptor")
    private HandlerInterceptor timeInterceptor;

}
