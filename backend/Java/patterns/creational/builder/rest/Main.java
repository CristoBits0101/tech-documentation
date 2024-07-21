package patterns.creational.builder.rest;

import patterns.creational.builder.beans.Vehiculo;
import patterns.creational.builder.impl.CocheBuilder;

public class Main {
    public static void main(String[] args) {

        Vehiculo vehiculo = new CocheBuilder("Renault")
                .setPuertas(5)
                .setMotor("V8")
                .build();

        System.out.println("Marca: " + vehiculo.getMarca());
        System.out.println("Puertas: " + vehiculo.getPuertas());
        System.out.println("Motor: " + vehiculo.getMotor());
        System.out.println("Marca: " + vehiculo.getTipo());
    }
}
