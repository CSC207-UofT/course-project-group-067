package EntityCreation.DishCreation;

import EntityCreation.IngredientCreation.IngredientCreator;
import EntityCreation.IngredientCreation.RuntimeIngredientBuilder;
import EntityCreation.IngredientException;
import ObjectConversion.ReferenceStorage;

public class RuntimeDishBuilder extends DishBuilder {
    private IngredientException noIngredient = new IngredientException();

    @Override
    void buildName() {
        System.out.println("Enter Dish Name");
        String input = sc.nextLine().trim();
        dish.addName(input);
    }

    @Override
    void buildTime() {
        System.out.println("Enter Cook Time in Minutes:");
        int input = sc.nextInt();
        dish.addTime(input);
    }

    @Override
    void buildIngredients() {
        System.out.println("Enter Ingredients, END to finish");
        sc.nextLine();
        String input = sc.nextLine();

        while(!(input.equals("END"))){
            try{
            dish.addIngredient(ReferenceStorage.im.nameToIngredient(input));}
            catch(Exception IllegalStateException) {
                noIngredient.run(input);
                dish.addIngredient(ReferenceStorage.im.nameToIngredient(input));
                System.out.println("Ingredient added");
            }
            input = sc.nextLine();
        }
    }

    @Override
    void buildMethod() {
        System.out.println("Enter Cooking Instructions, END to finish");
        String input = sc.nextLine();

        while(!(input.equals("END"))){
            dish.addMethod(input);
            input = sc.nextLine();
        }

    }
}
