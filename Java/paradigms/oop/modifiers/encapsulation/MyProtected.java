package paradigms.oop.modifiers.encapsulation;

public class MyProtected {

    protected static int phone;

    protected MyProtected() {
    }

    protected static int getAge() {
        return phone;
    }

    protected static void setAge(int number) {
        phone = number;
    }

    public static void main(String[] args) {
        MyPublic.name = "12345678A";
        System.out.println(MyPublic.name);
    }

}
