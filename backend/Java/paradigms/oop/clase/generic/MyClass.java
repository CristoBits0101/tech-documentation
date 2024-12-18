package paradigms.oop.clase.generic;

public class MyClass {

    public static void main(String[] args) {
        MyClass myClass = new MyClass("Cristo", 12, 1.2);
        System.out.println(myClass.name);
    }

    public String name;
    protected int age;
    private double account;

    public MyClass() {
    }

    protected MyClass(String name, int age) {
        this.name = name;
        this.age = age;
    }

    private MyClass(String name, int age, double account) {
        this.name = name;
        this.age = age;
        this.account = account;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getAccount() {
        return account;
    }

    public void setAccount(double account) {
        this.account = account;
    }

}
