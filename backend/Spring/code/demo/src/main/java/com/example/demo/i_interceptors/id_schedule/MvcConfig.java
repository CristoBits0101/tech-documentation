// package com.example.demo.i_interceptors.id_schedule;

// import org.springframework.beans.factory.annotation.Autowired;
// import org.springframework.beans.factory.annotation.Qualifier;
// import org.springframework.context.annotation.Configuration;
// import org.springframework.lang.NonNull;
// import org.springframework.web.servlet.HandlerInterceptor;
// import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
// import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

// @Configuration
// public class MvcConfig implements WebMvcConfigurer {

//     @Autowired
//     @Qualifier("calendarInterceptor")
//     private HandlerInterceptor calendar;

//     @Override
//     public void addInterceptors(@NonNull InterceptorRegistry registry) {
//         registry.addInterceptor(calendar).addPathPatterns("/foo");
//     }
    
// }
