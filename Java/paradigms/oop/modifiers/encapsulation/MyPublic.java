package paradigms.oop.modifiers.encapsulation;

public class MyPublic {

    public static String name;

    public MyPublic() {
    }

    public static String getName() {
        return name;
    }

    public static void setName(String name) {
        MyPublic.name = name;
    }

}
