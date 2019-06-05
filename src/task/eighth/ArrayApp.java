package task.eighth;

import java.util.Arrays;
import java.util.Iterator;
import java.util.Objects;

public class ArrayApp<T> implements ArrayList<T> {
    public static void main(String[] args) {
        ArrayList<String> food = new ArrayApp<>();
        food.add("lasagna");
        food.add("tiramisu");
        food.add("pasta");
        food.add("frittura mista");
        food.add("ice cream");
        food.add("chicheti");
        food.add("pizza", 0);
        food.get(1);
        food.remove(4);

        ArrayList<String> drink = new ArrayApp<>();
        drink.add("wine");
        drink.add("prosecco");
        drink.add("aperol");
        food.addAll(drink);
        for (int i = 0; i < food.size(); i++) {
            System.out.println((i + 1) + " - " + food.get(i));
        }

        System.out.println("Size is - " + food.size());
        System.out.println("Remove value is " + food.remove("wine"));
        System.out.println(food.isEmpty());

    }

    private T[] values;

    public ArrayApp() {
        values = (T[]) new Object[0];
    }

    @Override
    public void add(T value) {
        try {
            T[] temp = values;
            values = (T[]) new Object[temp.length + 1];
            System.arraycopy(temp, 0, values, 0, temp.length);
            values[values.length - 1] = value;
        } catch (ClassCastException ex) {
            ex.printStackTrace();
        }
    }

    @Override
    public void add(T value, int index) {
        values[index] = value;

    }

    @Override
    public void addAll(ArrayList<T> list) {
        T[] temp = values;
        values = (T[]) new Object[temp.length + list.size()];
        System.arraycopy(temp, 0, values, 0, temp.length);
        for (int i = 0; i < list.size(); i++) {
            values[temp.length + i] = list.get(i);
        }
        // System.arraycopy(list,0,values,list.size(),list.size()); --- don't work. I don't understand why. I try list.toArray
    }

    @Override
    public T get(int index) {
        return values[index];
    }

    @Override
    public void set(T value, int index) {

    }

    @Override
    public T remove(int index) {
        try {
            T[] temp = values;
            values = (T[]) new Object[temp.length - 1];
            System.arraycopy(temp, 0, values, 0, index);
            int amountElementovAfterIndex = temp.length - index - 1;
            System.arraycopy(temp, index + 1, values, index, amountElementovAfterIndex);
        } catch (ClassCastException ex) {
            ex.printStackTrace();
        }
        return values[index];
    }

    @Override
    public T remove(T t) {
        T removValue = null;
        for (int i = 0; i < size(); i++) {
            if (values[i].equals(t)) {
                removValue = t;
                values[i] = null;
            }
        }
        return removValue;
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
    public Iterator<T> iterator() {
        return new ArrayIterator<>(values);
    }

    @Override
    public String toString() {
        return "ArrayApp{" +
                "values=" + Arrays.toString(values) +
                '}';
    }
}
