package patterns.behavioral.observer.impl;

import patterns.behavioral.observer.service.Receptor;

public class ReceptorRadio implements Receptor {
    @Override
    public void recibe() {
        System.out.println("Señal recibida en la radio.");
    }
}
