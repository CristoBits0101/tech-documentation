package paradigms.oop.object.polymorphisms;

import paradigms.oop.object.polymorphisms.automotive.children.MyCar;
import paradigms.oop.object.polymorphisms.automotive.children.MyMotorcycle;
import paradigms.oop.object.polymorphisms.automotive.parent.MyVehicle;

public class MyPolymorphism {
    public static void main(String[] args) {

        MyVehicle vehicle;

        vehicle = new MyMotorcycle();
        vehicle = new MyCar();

        System.out.println(vehicle);

    }
}
