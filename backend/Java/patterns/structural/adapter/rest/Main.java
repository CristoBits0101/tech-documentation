package patterns.structural.adapter.rest;

import patterns.structural.adapter.impl.Horno;
import patterns.structural.adapter.impl.Lampara;
import patterns.structural.adapter.impl.PowerAdapter;
import patterns.structural.adapter.service.EnchufableService;

public class Main {

    public static void main(String[] args) {

        Horno horno = new Horno();
        Lampara lampara = new Lampara();
        PowerAdapter adapter = new PowerAdapter();

        enciende(horno);
        enciende(lampara);
        enciende(adapter);

    }

    public static void enciende(EnchufableService enchufableService) {
        enchufableService.enciende();
    }

    public static void apaga(EnchufableService enchufableService) {
        enchufableService.apaga();
    }

    public static boolean encendido(EnchufableService enchufableService) {
        return enchufableService.encendido();
    }

}
