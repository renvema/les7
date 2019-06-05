package task.seventh;

public class Main {
    public static void main(String[] args) {
        Dress dress = new Dress("blue", 'M');
        Cupboard<Integer, Dress> cupboard = new Cupboard<>(1, dress);
        cupboard.getValue();
        System.out.println(cupboard.getValue().toString());
    }
}
