package task.seventh;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Cupboard<Integer, String> comod = new Cupboard<>();
        comod.put(1, "Skirt");
        comod.put(2, "Dress");
        comod.put(3, "Hat");
        comod.get(2);
        System.out.println(comod);
        System.out.println(comod.get(2));
    }
}
