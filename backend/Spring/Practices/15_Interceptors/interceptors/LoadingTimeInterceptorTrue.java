package com.cristobits0101.interceptor.interceptor.interceptors;

import java.util.Random;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import org.springframework.web.method.HandlerMethod;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import io.micrometer.common.lang.Nullable;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@Component("timeInterceptor")
public class LoadingTimeInterceptorTrue implements HandlerInterceptor {

    private static final Logger logger = LoggerFactory.getLogger(LoadingTimeInterceptorTrue.class);

    /**
     * Se ejecuta antes de que se ejecute la solicitud.
     */
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
            throws Exception {
        if (handler instanceof HandlerMethod) {

            HandlerMethod controller = (HandlerMethod) handler;
            logger.info("LoadingTimeInterceptor: preHandle() entrando... " + controller.getMethod().getName());

            // Calculamos el tiempo que tarda en cargar la página.
            long start = System.currentTimeMillis();
            request.setAttribute("start", start);

            Random random = new Random();
            int delay = random.nextInt(500);
            Thread.sleep(delay);

        } else {
            logger.warn("LoadingTimeInterceptor: preHandle() - El handler no es una instancia de HandlerMethod.");
        }
        return true;
    }

    /**
     * Se ejecuta después de que se ejecute la solicitud.
     */
    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler,
            @Nullable ModelAndView modelAndView) throws Exception {
        if (handler instanceof HandlerMethod) {
            logger.info("LoadingTimeInterceptor: postHandle() saliendo... "
                    + ((HandlerMethod) handler).getMethod().getName());
            long end = System.currentTimeMillis();
            long start = (long) request.getAttribute("start");
            long result = end - start;
            logger.info("LoadingTimeInterceptor: postHandle() - Tiempo de carga: " + result + " ms");
        } else {
            logger.warn("LoadingTimeInterceptor: postHandle() - El handler no es una instancia de HandlerMethod.");
        }
    }

}