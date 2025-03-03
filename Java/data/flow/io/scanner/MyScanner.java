package data.flow.io.scanner;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MyScanner {
    public static void main(String[] args) {
        String name = "";
        int age = 0;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.print("Por favor, ingrese su name: ");
            System.out.print("Por favor, ingrese su edad: ");
            try {
                name = scanner.next();
                age = scanner.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("Error: " + e.getMessage());
            }
        } while (age < 0 || age > 150 || name.length() > 15 || name.length() < 2);
        System.out.println(name + " tiene " + age + " años.");
        scanner.close();
    }
}
