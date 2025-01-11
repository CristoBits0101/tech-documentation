package data.flow.io.console;

public class MyPrintStream {
    public static void main(String[] args) {

        java.io.PrintStream printStream = System.out;

        int numero = 42;
        printStream.println("Imprimir en consola con PrintStream: " + numero);

        printStream.close();

    }
}
