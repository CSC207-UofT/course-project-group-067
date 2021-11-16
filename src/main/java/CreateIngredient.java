import java.util.Scanner;

public class CreateIngredient {
    static Scanner sc = new Scanner(System.in);

    public static void create(IngredientManager ingredientManager){
        Ingredient i = new Ingredient();
        fieldName(i);
        ingredientManager.addIngredientToList(i);
    }

    private static void fieldName(Ingredient i) {
        System.out.println("Enter Ingredient Name");
        String name = sc.nextLine().strip();
        i.addName(name);
    }

    private static void fieldAttribute(Ingredient i) {
        System.out.println("Enter Attributes, END to finish");
        String input = sc.nextLine();

        while(!(input.equals("END"))){
            input = sc.nextLine();
        }

    }

}
