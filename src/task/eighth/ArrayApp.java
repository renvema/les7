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
        Object app =new Object();
     if (size>=CAPASITY){
         grow();
     }
     values[size]= (T) app;
//        T[] temp = values;
//        values = (T[]) new Object[temp.length + 1];
//        System.arraycopy(temp, 0, values, 0, temp.length);
//        values[values.length - 1] = value;

    }

    @Override
    public void add(T value, int index) {
        values[index] = value;

    }
    @Override
   public void addAll(List<T> list) {
        for (int i = 0; i < list.size(); i++) {
            add(list.get(i));
        }
    }

//    @Override
//    public void addAll(List<T> list) {
//        T[] temp = values;
//        values = (T[]) new Object[temp.length + list.size()];
//        System.arraycopy(temp, 0, values, 0, temp.length);
//        for (int i = 0; i < list.size(); i++) {
//            values[temp.length + i] = list.get(i);
//        }
//    }

    private void grow(){
        values=Arrays.copyOf(values,values.length*3/2);
    }
//public T[] checkSize(){
//        if (size>=CAPASITY) {
//            values=(T[]) new Object [CAPASITY*3/2];
//        return T[] values;
//        }
//        return null;
//}

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
    public String toString() {
        return "ArrayApp{" +
                "values=" + Arrays.toString(values) +
                '}';
    }
}