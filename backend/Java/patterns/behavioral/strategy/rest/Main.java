package patterns.behavioral.strategy.rest;

import patterns.behavioral.strategy.beans.Usuario;
import patterns.behavioral.strategy.beans.Usuarios;
import patterns.behavioral.strategy.impl.EstrategiaCreacionSimple;

public class Main {
    public static void main(String[] args) {
        // Usando estrategia de memoria
        Usuarios usuarios = new Usuarios(new EstrategiaCreacionSimple());
        usuarios.crear("Cristo1");
        usuarios.crear("Cristo2");
        usuarios.crear("Cristo3");

        for (Usuario usuario : usuarios.listar()) {
            System.out.println("Usuario: " + usuario.getNombre());
        }
    }
}
