package security.warnings;

public class MySuppress {

    public static void main(String[] args) {
        demo();
    }

    @SuppressWarnings("rawtypes")
    public static void demo() {
        System.out.println("Hola");
    }

}
