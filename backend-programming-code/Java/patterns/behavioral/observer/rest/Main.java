package patterns.behavioral.observer.rest;

import patterns.behavioral.observer.impl.Emisor;
import patterns.behavioral.observer.impl.ReceptorRadio;
import patterns.behavioral.observer.impl.ReceptorTV;

public class Main {
    public static void main(String[] args) {
        // 
        Emisor emisor = new Emisor();

        // 
        ReceptorTV tv = new ReceptorTV();
        ReceptorRadio radio = new ReceptorRadio();

        // 
        emisor.addReceptor(tv);
        emisor.addReceptor(radio);

        // 
        emisor.emite();
    }
}
