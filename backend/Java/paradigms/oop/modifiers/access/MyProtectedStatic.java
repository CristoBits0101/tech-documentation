package paradigms.oop.modifiers.access;

public class MyProtectedStatic {

    protected static int phone;

    protected MyProtectedStatic() {
    }

    protected static int getAge() {
        return phone;
    }

    protected static void setAge(int number) {
        phone = number;
    }

    public static void main(String[] args) {
        MyPublicStatic.name = "12345678A";
        System.out.println(MyPublicStatic.name);
    }

}
