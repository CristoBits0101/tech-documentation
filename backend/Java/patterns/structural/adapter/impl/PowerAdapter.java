package patterns.structural.adapter.impl;

import patterns.structural.adapter.beans.EnglishLightBulb;
import patterns.structural.adapter.service.EnchufableService;

// Se implementa la interfaz sobre la clase a adaptar.
public class PowerAdapter implements EnchufableService {

    // En el adaptador sé instancia la clase a adaptar.
    public EnglishLightBulb englishLightBulb = new EnglishLightBulb();

    boolean encendido = false;

    @Override
    public void enciende() {
        englishLightBulb.turnOn(110);
    }

    @Override
    public void apaga() {
        englishLightBulb.turnOff();
    }

    @Override
    public boolean encendido() {
        return this.encendido;
    }

}
