package com.example.demo.h_exceptions.hb_controller.hbb_advice.hbbc_exception;

/**
 * Esta clase es para capturar los THROW se mapea junto a los metódos de tipo de excepsión
 * Esta clase esta mapeade junto a la clase que mapea las nulas
 * Cuando en el controlador se dispare null esta función lo captura
 * Y se lo pasa a este constructor
 */
public class HBBCA_UserNotFoundException extends RuntimeException {

    public HBBCA_UserNotFoundException(String message) {
        super(message);
    }

}
