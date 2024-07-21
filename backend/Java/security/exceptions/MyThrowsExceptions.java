package security.exceptions;

public class MyThrowsExceptions {

    public static void main(String[] args) {
        division(10, 0);
        try {
            metodoA();
        } catch (Exception e) {
            System.out.println("Excepción capturada en main: " + e.getMessage());
        }
    }

    public static int division(int a, int b) throws ArithmeticException {
        int result;
        try {
            result = a / b;
        } catch (ArithmeticException e) {
            throw new ArithmeticException();
        }
        return result;
    }

    public static void metodoA() throws Exception {
        metodoB();
    }

    public static void metodoB() throws Exception {
        metodoC();
    }

    public static void metodoC() throws Exception {
        throw new Exception("Excepción lanzada desde metodoC");
    }

}
