package data.operations;

public class MyComparison {

    public static void main(String[] args) {
        compareUsingEquals("Hola", "Hola");
        compareUsingEqualsIgnoreCase("Hola", "hola");
        compareUsingCompareTo("Hola", "Adiós");
        compareUsingCompareToIgnoreCase("Hola", "hola");
    }

    // equals
    private static void compareUsingEquals(String str1, String str2) {
        if (str1.equals(str2)) {
            System.out.println("Las cadenas son iguales.");
        } else {
            System.out.println("Las cadenas son diferentes.");
        }
    }

    // equalsIgnoreCase
    private static void compareUsingEqualsIgnoreCase(String str1, String str2) {
        if (str1.equalsIgnoreCase(str2)) {
            System.out.println("Las cadenas son iguales (ignorando mayúsculas y minúsculas).");
        } else {
            System.out.println("Las cadenas son diferentes.");
        }
    }

    // compareTo
    private static void compareUsingCompareTo(String str1, String str2) {
        int result = str1.compareTo(str2);
        if (result < 0) {
            System.out.println("La cadena '" + str1 + "' es menor que '" + str2 + "'.");
        } else if (result == 0) {
            System.out.println("Las cadenas son iguales.");
        } else {
            System.out.println("La cadena '" + str1 + "' es mayor que '" + str2 + "'.");
        }
    }

    // compareToIgnoreCase
    private static void compareUsingCompareToIgnoreCase(String str1, String str2) {
        int result = str1.compareToIgnoreCase(str2);
        if (result < 0) {
            System.out.println("La cadena '" + str1 + "' es menor que '" + str2 + "' (ignorando mayúsculas y minúsculas).");
        } else if (result == 0) {
            System.out.println("Las cadenas son iguales (ignorando mayúsculas y minúsculas).");
        } else {
            System.out.println("La cadena '" + str1 + "' es mayor que '" + str2 + "' (ignorando mayúsculas y minúsculas).");
        }
    }
    
}
