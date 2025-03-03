package data.structures.collections.maps;

import java.util.Map;
import java.util.HashMap;

public class MyHashMap {
    public static void main(String[] args) {

        Map<String, Integer> map = new HashMap<>();

        map.put("One", 1);
        map.put("One", 2);
        map.get("One");
        map.remove("Three");

        map.size();
        map.clear();

        for (String key : map.keySet()) { System.out.println(key); }
        for (Integer value : map.values()) { System.out.println(value); }
        for (Map.Entry<String, Integer> entry : map.entrySet()) { System.out.println(entry.getKey() + " = " + entry.getValue()); }

    }
}
