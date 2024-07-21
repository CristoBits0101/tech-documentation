package security.exceptions;

public class MyArithmeticException {
    public static void main(String[] args) {
        try {
            int result = 10 / 0;
            System.out.println(result);
        } catch (ArithmeticException e) {
            System.out.println("Capturando error: " + e.getMessage());
        } finally {
            System.out.println("Hacer algo siempre");
        }
    }
}
