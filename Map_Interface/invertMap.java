package Map_Interface;

import java.util.*;

public class invertMap {
    public static <K, V> Map<V, List<K>> invert(Map<K, V> map) {
        Map<V, List<K>> inverted = new HashMap<>();
        for (Map.Entry<K, V> e : map.entrySet()) {
            inverted.computeIfAbsent(e.getValue(), v -> new ArrayList<>()).add(e.getKey());
        }
        return inverted;
    }

    public static void main(String[] args) {
        Map<String, Integer> m = new HashMap<>();
        m.put("A", 1);
        m.put("B", 2);
        m.put("C", 1);

        System.out.println(invert(m));
    }
}