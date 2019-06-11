package task.eighth;

import java.util.Arrays;

public class ArrayApp<T> implements List<T> {

    private T[] values;
    private final int CAPASITY = 10;
    private int size;

    public ArrayApp() {
        values = (T[]) new Object[CAPASITY];
    }

    @Override
    public void add(T value) {
        if (size >= CAPASITY) {
            grow();
        }
        values[size] = value;
        size++;
    }

    @Override
    public void add(T value, int index) {
        values[index] = value;

    }

    private void grow() {
        values = Arrays.copyOf(values, values.length * 3 / 2);
    }

    @Override
    public void addAll(List<T> list) {
        if (!list.isEmpty()) {
            for (int i = 0; i < list.size(); i++) {
                add(list.get(i));
            }
        }
    }

    @Override
    public T get(int index) {
        return values[index];
    }

    @Override
    public void set(T value, int index) {
        values[index] = value;
    }

    @Override
    public T remove(int index) {
        size--;
        System.arraycopy(values, index + 1, values, index, size - index);
        return values[index];
    }

    @Override
    public T remove(T t) {
        for (int i = 0; i < size(); i++) {
            if (values[i].equals(t)) {
                return remove(i);
            }
        }
        return null;
    }

    @Override
    public int size() {
        return values.length;
    }

    @Override
    public boolean isEmpty() {
        return values.length == 0;
    }

    @Override
    public String toString() {
        return "ArrayApp{" +
                "values=" + Arrays.toString(values) +
                '}';
    }
}
