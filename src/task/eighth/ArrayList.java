package task.eighth;

import java.util.Arrays;

public class ArrayList<T> implements List<T> {

    private T[] values;
    private final int CAPASITY = 10;
    private int size = 0;

    public ArrayList() {
        values = (T[]) new Object[CAPASITY];
    }

    @Override
    public void add(T value) {
        if (size >= values.length) {
            grow();
        }
        values[size] = value;
        size++;
    }

    @Override
    public void add(T value, int index) {
        checkSize(index);
        if (size >= values.length) {
            grow();
        }
        System.arraycopy(values, 0, values, 0, index - 1);
        System.arraycopy(values, index, values, index + 1, size - index);
        values[index] = value;
        size++;
    }

    private void grow() {
        values = Arrays.copyOf(values, values.length * 3 / 2);
    }

    @Override
    public void addAll(List<T> list) {
        checkSize(size);
        if (!list.isEmpty()) {
            for (int i = 0; i < list.size(); i++) {
                add(list.get(i));
            }
        }
    }

    @Override
    public T get(int index) {
        checkSize(index);
        return values[index];
    }

    @Override
    public void set(T value, int index) {
        checkSize(index);
        values[index] = value;
    }

    @Override
    public T remove(int index) {
        checkSize(index);
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
        size--;
        return null;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    public void checkSize(int index) {
        if ((index > size) || (index < 0)) {
            throw new IllegalArgumentException();
        }
    }

    @Override
    public String toString() {
        return "ArrayList{" +
                "values=" + Arrays.toString(values) +
                '}';
    }
}
