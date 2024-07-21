package data.structures.collections.lists;

public class MyLinkedList {
    public static void main(String[] args) {

        java.util.LinkedList<Double> LinkedList = new java.util.LinkedList<>();

        LinkedList.add(1.0d);
        LinkedList.get(0);
        LinkedList.set(0, 3.2d);
        LinkedList.remove(0);

        LinkedList.size();
        LinkedList.clear();

        for (int i = 0; i < LinkedList.size(); i++)
            System.out.println(i);

        for (Double element : LinkedList)
            System.out.println(element);

    }
}
