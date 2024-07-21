package data.structures.collections.lists;

import java.util.Vector;

public class MyVector {
    public static void main(String[] args) {

        Vector<Integer> vector1 = new Vector<>();
        Vector<Integer> vector2 = new Vector<>(50, 15);

        boolean result = vector1.equals(vector2);

        vector1.add(10);
        vector1.get(0);
        vector1.set(0, 5);
        vector1.remove(1);

        vector1.size();
        vector1.clear();

        for (int i = 0; i < vector1.size(); i++) { System.out.println(vector1.get(i) + " "); }
        for (int element : vector1) { System.out.println(element + " "); }
        
    }
}
