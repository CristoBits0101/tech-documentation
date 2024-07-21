package paradigms.oop.object.composition;

public class MyCar {

    private final MyEngine engine;

    public MyCar() {
        engine = new MyEngine();
    }

    public void turnOn() {
        engine.start();
        System.out.println("The car is on");
    }

}
