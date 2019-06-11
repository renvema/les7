package task.eighth;

public class App {
    public static void main(String[] args) {
        List<String> food = new ArrayApp<>();
        food.add("lasagna");
        food.add("tiramisu");
        food.add("pasta");
        food.add("frittura mista");
        food.add("ice cream");
        food.add("chicheti");
        food.add("pizza", 0);
        food.get(1);
        food.remove(4);

        List<String> drink = new ArrayApp<>();
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
}
