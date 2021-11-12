package EntityCreation.DishCreation;

import ObjectConversion.ReferenceStorage;

public class RuntimeDishBuilder extends DishBuilder {
    @Override
    void buildName() {
        System.out.println("Enter Entities.Dish Name");
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
            dish.addIngredient(ReferenceStorage.im.nameToIngredient(input));
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
