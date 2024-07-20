package patterns.structural.decorator.rest;

import patterns.structural.decorator.beans.PhoneNextGen;
import patterns.structural.decorator.beans.Smartphone;
import patterns.structural.decorator.impl.PhoneImpl;

public class Main {
    public static void main(String[] args) {

        PhoneImpl phone = new PhoneImpl();
        phone.create();

        System.out.println();

        Smartphone smartphone = new Smartphone(new PhoneImpl());
        smartphone.create();

        System.out.println();

        PhoneNextGen phoneNextGen = new PhoneNextGen(new PhoneImpl());
        phoneNextGen.create();
        
    }
}
