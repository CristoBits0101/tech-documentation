package patterns.behavioral.observer.impl;

import patterns.behavioral.observer.service.Receptor;

public class ReceptorSatelite implements Receptor {
    @Override
    public void recibe() {
        System.out.println("Señal recibida en el satélite.");
    }
}
