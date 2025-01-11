package data.structures.collections.sets;

import java.util.Set;
import java.util.HashSet;

public class MyHashSet {
    public static void main(String[] args) {

        Set<Integer> keys = new HashSet<>();

        keys.add(1);
        keys.remove(1);

        keys.size();
        keys.clear();

    }
}
