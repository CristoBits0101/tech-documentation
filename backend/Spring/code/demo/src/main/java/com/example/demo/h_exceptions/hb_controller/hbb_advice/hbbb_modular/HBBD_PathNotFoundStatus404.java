package com.example.demo.h_exceptions.hb_controller.hbb_advice.hbbb_modular;

import java.util.Date;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.NoHandlerFoundException;

import com.example.demo.h_exceptions.ha_model.haa_advice.HAA_Error;

@ControllerAdvice
public class HBBD_PathNotFoundStatus404 {

    /**
     * CONFIGURAR EL "APPLICATION.PROPERTIES"
     * 
     * Spring maneja los 404 y hay que decirle que no lo haga
     * spring.mvc.throw-exception-if-no-handler-found=true
     * spring.web.resources.add-mappings=false
     * 
     * La ruta al controlador no funciona o no existe
     */
    @ExceptionHandler(NoHandlerFoundException.class)
    public ResponseEntity<?> pathNotFoundStatus404(NoHandlerFoundException e) {

        HAA_Error error = new HAA_Error();

        error.setError("Error: La ruta no funciona."); // Personalizado
        error.setMessage(e.getMessage());              // Pertenece a Exception e
        error.setStatus(HttpStatus.NOT_FOUND.value()); // Pertenece a HttpStatus de Spring
        error.setDate(new Date());                     // Pertenece a java.util.Date

        // return ResponseEntity
        //          .status("404")
        //          .body("Error 404");

        return ResponseEntity
                .status(404)
                .body(error);

    }

}
