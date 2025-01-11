package security.exceptions;

public class MyGlobalException {
    public static void main(String[] args) {
        try {
            int result = 10 / 0;
            System.out.println(result);
        } catch (Exception e) {
            System.out.println("Capturando error: " + e.getMessage());
        }
    }
}
