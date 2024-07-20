package patterns.behavioral.strategy.impl;

import java.util.ArrayList;
import java.util.List;

import patterns.behavioral.strategy.beans.Usuario;
import patterns.behavioral.strategy.service.EstrategiaCreacion;

public class EstrategiaCreacionSimple implements EstrategiaCreacion {
    private List<Usuario> usuarios = new ArrayList<>();

    @Override
    public void crearUsuario(String nombre) {
        usuarios.add(new Usuario(nombre));
    }

    @Override
    public List<Usuario> listarUsuarios() {
        return usuarios;
    }
}
