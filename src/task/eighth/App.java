package task.eighth;

public class App {
    public static void main(String[] args) {
        List<String> food = new ArrayList<>();
        food.add("lasagna");
        food.add("tiramisu");
        food.add("pasta");
        food.add("frittura mista");
        food.add("ice cream");
        food.add("chicheti");
        food.add("pizza", 3);

        List<String> drink = new ArrayList<>();
        drink.add("wine");
        drink.add("prosecco");
        drink.add("aperol");
        food.addAll(drink);
        food.remove(6);
        for (int i = 0; i < food.size(); i++) {
            System.out.println((i + 1) + " - " + food.get(i));
        }

        System.out.println("Size is - " + food.size());

        System.out.println(food.isEmpty());

    }
}
