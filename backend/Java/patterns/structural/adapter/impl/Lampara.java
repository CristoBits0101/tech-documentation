package patterns.structural.adapter.impl;

import patterns.structural.adapter.service.EnchufableService;

public class Lampara implements EnchufableService {

    boolean encendido = false;

    @Override
    public void enciende() {
        System.out.println("Lampara enciende");
    }

    @Override
    public void apaga() {
        System.out.println("Lampara apaga");
    }

    @Override
    public boolean encendido() {
        return this.encendido;
    }

}
