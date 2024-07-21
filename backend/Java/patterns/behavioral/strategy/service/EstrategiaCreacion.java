package patterns.behavioral.strategy.service;

import java.util.List;

import patterns.behavioral.strategy.beans.Usuario;

public interface EstrategiaCreacion {
    void crearUsuario(String nombre);

    List<Usuario> listarUsuarios();
}
