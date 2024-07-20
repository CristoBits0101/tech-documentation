package patterns.structural.decorator.beans;

import patterns.structural.decorator.impl.PhoneDecorator;
import patterns.structural.decorator.service.PhoneService;

public class Smartphone extends PhoneDecorator {

    public Smartphone(PhoneService phoneService) {
        super(phoneService);
    }

    @Override
    public void create() {
        super.create();
        System.out.println("Soy un teléfono smartphone.");
    }

}
