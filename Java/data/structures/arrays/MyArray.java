package data.structures.arrays;

public class MyArray {

    public MyArray(){}
    public static void main(String[] args) {

        short[] array1 = new short[2];
        float[] array2 = { 0.0f, 1.1f };

        MyMatrix[] array3 = new MyMatrix[3];
        MyMatrix[] array4 = { new MyMatrix(), new MyMatrix(), new MyMatrix() };

        for (int i = 0; i < array2.length; i++) { System.out.println(i); }
        System.out.println();

        for (int i = 0; i <= array2.length - 1; i++) { System.out.println(i); }
        System.out.println();

        int iterations = 0;
        for (short array : array1) { System.out.println(iterations++); }

    }
}
