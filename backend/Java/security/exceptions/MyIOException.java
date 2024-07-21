package security.exceptions;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MyIOException extends Throwable {

    public static void main(String[] args) {
        try {
            readInput();
        } catch (IOException e) {
            System.err.println("IOException caught: " + e.getMessage());
        } finally {
            System.out.println("Finally block - cleanup code goes here.");
        }
    }

    private static void readInput() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter something: ");
        String input = reader.readLine();
        System.out.println("You entered: " + input);
    }

}
