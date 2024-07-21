package paradigms.oop.modifiers.encapsulation;

public class MyPrivate {

    private static String dni;

    private MyPrivate() {
    }

    private static String getDni() {
        return dni;
    }

    private static void setDni(String number) {
        dni = number;
        System.out.println(dni);
    }

    public static void main(String[] args) {
        setDni("20222426B");
        getDni();
    }

}
