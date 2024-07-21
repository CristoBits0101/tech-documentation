package com.cristobits0101.interceptor.interceptor;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * Se usa también para registrar los interceptores.
 */
@Configuration
public class AppConfig implements WebMvcConfigurer {

    @Autowired
    @Qualifier("timeInterceptor")
    private HandlerInterceptor timeInterceptor;

    @Override
    public void addInterceptors(InterceptorRegistry registry) {

        /**
         * Se ejecuta en todas las rutas.
         */
        // registry.addInterceptor(timeInterceptor);
        
        /**
         * Se ejecuta solo en la ruta /app/foo1.
         */
        // registry.addInterceptor(timeInterceptor).addPathPatterns("/app/foo1");

        /**
         * Se ejecuta solo en las rutas /app/foo1 y /app/foo2.
         */
        // registry.addInterceptor(timeInterceptor).addPathPatterns("/app/foo1", "/app/foo2");

        /**
         * Se ejecuta en todas las rutas excepto /app/foo1 y /app/foo2.
         */
        registry.addInterceptor(timeInterceptor).excludePathPatterns("/app/foo1", "/app/foo2");

        /**
         * Se ejecuta en todas las rutas dentro de /app.
         */
        registry.addInterceptor(timeInterceptor).excludePathPatterns("/app/**");

    }

}
