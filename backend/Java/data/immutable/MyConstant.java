package data.immutable;

public final class MyConstant {

    final int var = 2;

    private final static void finalElement() {
        System.out.println("Final clase no se puede extender.");
        System.out.println("Final variable no se puede modificar.");
        System.out.println("Final método no se puede hacer override.");
    }

    public static void main(String[] args) {
        finalElement();
    }

}
