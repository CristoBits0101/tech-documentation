package security.exceptions;

public class MyMultipleException {

    public static void main(String[] args) {
        try {
            int result = 10 / 0;
            System.out.println(result);
        } catch (ArithmeticException f) {
            System.out.println("Capturando error: " + f.getMessage());
        } catch (Exception e) {
            System.out.println("Capturando error: " + e.getMessage());
        }
    }
}
