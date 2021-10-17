import java.util.Scanner;

public class CreateDish {
    static Scanner sc = new Scanner(System.in);


    public static void create(DishManager dishManager, IngredientManager ingredientManager){
        Dish dish = new Dish();
        fieldName(dish);
        fieldIngredients(dish, ingredientManager);
        fieldMethod(dish);
        fieldTime(dish);
        fieldTime(dish);
        dishManager.addDishToList(dish);
    }

    private static void fieldName(Dish dish) {
        System.out.println("Enter Dish Name");
        String name = sc.nextLine().strip();
        dish.addName(name);
    }

    private static void fieldTime(Dish dish) {
        System.out.println("Enter Cook Time in Minutes:");
        int input = sc.nextInt();
        dish.addTime(input);
    }

    private static void fieldIngredients(Dish dish, IngredientManager ingredientManager){
        System.out.println("Enter Ingredients, END to finish");
        String input = sc.nextLine();

        while(!(input.equals("END"))){
            dish.addIngredient(ingredientManager.nameToIngredient(input));
            input = sc.nextLine();
        }

    }

    private static void fieldMethod(Dish dish){
        System.out.println("Enter Cooking Instructions, END to finish");
        String input = sc.nextLine();

        while(!(input.equals("END"))){
            dish.addMethod(input);
            input = sc.nextLine();
        }

    }
}
