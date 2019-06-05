package task.seventh;

public class Main {
    public static void main(String[] args) {
        Cupboard<Integer, Dress> cupboard = new Cupboard<>(1, new Dress("blue", 'M'));
        cupboard.getValue();
        System.out.println(cupboard.getValue().toString());
    }
}
