package data.structures.collections.lists;

public class MyArrayList {
    public static void main(String[] args) {

        java.util.ArrayList<String> ArrayList = new java.util.ArrayList<>();

        ArrayList.add("Car");
        ArrayList.get(0);
        ArrayList.set(0, "Motorcycle");
        ArrayList.remove(0);

        ArrayList.size();
        ArrayList.clear();

        for (int i = 0; i < ArrayList.size(); i++) { System.out.println(ArrayList.get(i)); }
        for (String i : ArrayList) { System.out.println(i); }

    }
}
