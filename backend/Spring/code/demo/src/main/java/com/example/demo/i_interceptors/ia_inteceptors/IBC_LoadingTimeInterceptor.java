package com.example.demo.i_interceptors.ia_inteceptors;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.lang.Nullable;
import org.springframework.stereotype.Component;
import org.springframework.web.method.HandlerMethod;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;
import com.fasterxml.jackson.databind.ObjectMapper;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

// Ejemplo 2: LoadingTimeInterceptor con manejo de errores JSON
@Component("errorHandlingInterceptor")
public class IBC_LoadingTimeInterceptor implements HandlerInterceptor {

    private static final Logger logger = LoggerFactory.getLogger(IBC_LoadingTimeInterceptor.class);

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {

        HandlerMethod controller = (HandlerMethod) handler;
        logger.info("ErrorHandlingInterceptor: preHandle() entrando .... " + controller.getMethod().getName());

        // Simulación de una situación en la que no se permite el acceso
        Map<String, String> json = new HashMap<>();
        json.put("error", "no tienes acceso a esta pagina!");
        json.put("date", new Date().toString());

        ObjectMapper mapper = new ObjectMapper();
        String jsonString = mapper.writeValueAsString(json);
        response.setContentType("application/json");
        response.setStatus(HttpServletResponse.SC_UNAUTHORIZED);
        response.getWriter().write(jsonString);

        // Detiene la ejecución de la solicitud
        return false; 
        
    }

    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, @Nullable ModelAndView modelAndView) throws Exception {
        // No se necesita implementación aquí para este ejemplo
    }
}
