package paradigms.oop.modifiers.access;

public class MyPublicStatic {

    public static String name;

    public MyPublicStatic() {
    }

    public static String getName() {
        return name;
    }

    public static void setName(String name) {
        MyPublicStatic.name = name;
    }

}
