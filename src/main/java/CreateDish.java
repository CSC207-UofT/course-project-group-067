import java.util.Scanner;

public class CreateDish {
    static Scanner sc = new Scanner(System.in);


    public static void create(DishManager dishManager, IngredientManager ingredientManager){
        PlainDish dish = new PlainDish();
        fieldName(dish);
        fieldIngredients(dish, ingredientManager);
        fieldMethod(dish);
        fieldTime(dish);
        Dish decoratedDish = fieldAttributes(dish);
        dishManager.addDishToList(decoratedDish);
    }

    private static void fieldName(PlainDish dish) {
        System.out.println("Enter Dish Name");
        String name = sc.nextLine().strip();
        dish.addName(name);
    }

    private static void fieldTime(PlainDish dish) {
        System.out.println("Enter Cook Time in Minutes:");
        int input = sc.nextInt();
        dish.addTime(input);
    }

    private static void fieldIngredients(PlainDish dish, IngredientManager ingredientManager){
        System.out.println("Enter Ingredients, END to finish");
        String input = sc.nextLine();

        while(!(input.equals("END"))){
            dish.addIngredient(ingredientManager.nameToIngredient(input));
            input = sc.nextLine();
        }

    }

    private static void fieldMethod(PlainDish dish){
        System.out.println("Enter Cooking Instructions, END to finish");
        String input = sc.nextLine();

        while(!(input.equals("END"))){
            dish.addMethod(input);
            input = sc.nextLine();
        }

    }

    private static Dish fieldAttributes(PlainDish dish) {
        System.out.println("Enter Attributes, END to finish");
        System.out.println("Possible Attributes: Vegan, Kosher, Vegetarian, NutFree, GlutenFree");
        String input = "*";
        Dish currentLayer = dish;


        while(!(input.equals("END"))) {
            input = sc.nextLine();
            switch (input) {
                case "*": { break;
                }
                case "Vegan": {
                    currentLayer = new VeganDec(currentLayer);
                    break;
                }
                case "Vegetarian": {
                    currentLayer = new VegetarianDec(currentLayer);
                    break;
                }
                case "Kosher": {
                    currentLayer = new KosherDec(currentLayer);
                    break;
                }
                case "NutFree": {
                    currentLayer = new NutFreeDec(currentLayer);
                    break;
                }
                case "GlutenFree": {
                    currentLayer = new GlutenFreeDec(currentLayer);
                    break;
                }
                //default: System.out.println("Invalid input, please try again");
                //break;
            }



        }
        return currentLayer;
    }
}
