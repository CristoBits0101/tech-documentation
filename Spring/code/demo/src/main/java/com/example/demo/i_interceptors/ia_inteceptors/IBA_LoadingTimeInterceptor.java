package com.example.demo.i_interceptors.ia_inteceptors;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.lang.Nullable;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.method.HandlerMethod;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

// 1.1. ¡HAY QUE IMPLEMENTAR LA INTERFACE PARA QUE FUNCIONE!
// 1.2. SI SE RETORNA FALSE SE TERMINA LA EJECUCIÓN DE LA PETICIÓN
/**
 * Se pueden usar para ver si el usuario ya está logeado
 * O para registrar peticiones al servidor etc...
 */
@Component("loadingTimeInterceptor")

public class IBA_LoadingTimeInterceptor implements HandlerInterceptor {

    // ¡Opcional es para mostrar en la consola los datos!
    private static final Logger logger = LoggerFactory.getLogger(IBA_LoadingTimeInterceptor.class);

    /**
     * 2.1. Metódo de la interface que se ejecuta antés del controlador asociado
     * 2.2. Solo se añadió el logger el resto del código viene de la interface
     * 2.3. Se aplica a todas las rutas porque no se ha especificado ninguna
     */
    @SuppressWarnings("null")
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        HandlerMethod controller = ((HandlerMethod) handler);                                                  // 2.4. Esta clase se usa para actuar sobre controladores.
        logger.info("IBA_LoadingTimeInterceptor: preHandle() entrando..." + controller.getMethod().getName()); // 2.5. Mostramos un mensaje en el logger.
        return true;                                                                                           // 2.6. Retornamos un valor de exito o error.
    }

    /**
     * 3.1. Metódo de la interface que se ejecuta después del controlador asociado
     * 3.2. Solo se añadió el logger el resto del código viene de la interface
     * 3.3. Se aplica a todas las rutas porque no se ha especificado ninguna
     */
    @SuppressWarnings("null")
    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, @Nullable ModelAndView modelAndView) throws Exception {
        logger.info("IBA_LoadingTimeInterceptor: postHandle() saliendo...");
    }

}
