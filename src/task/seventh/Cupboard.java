package task.seventh;

import java.util.ArrayList;

public class Cupboard<K, V> {
    private ArrayList<K> keys = new ArrayList<>();
    private ArrayList<V> values = new ArrayList<>();

    public void put(K key, V value) {
        keys.add(key);
        values.add(value);
    }

    public V get(K key) {
        for (K Key : keys) {
            if (Key.equals(key)) {
                int index = keys.indexOf(Key);
                return values.get(index);
            }
        }
        return null;
    }

    @Override
    public String toString() {
        return "Cupboard{" +
                "keys=" + keys +
                ", values=" + values +
                '}';
    }
}
