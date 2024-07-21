package data.structures.arrays;

public class MyMatrix {

    public MyMatrix() {}

    public static void main(String[] args) {

        char[][] matrix = new char[1][1];

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) { System.out.println(matrix[i][j]); }
        }

        for (char[] row : matrix) {
            for (char element : row) { System.out.println(element); }
        }

    }

}
