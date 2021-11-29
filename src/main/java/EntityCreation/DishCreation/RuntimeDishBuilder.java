package EntityCreation.DishCreation;

import ObjectConversion.ReferenceStorage;

public class RuntimeDishBuilder extends DishBuilder {
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
            if((ReferenceStorage.im.getIngredientNames().contains(input))) {
                dish.addIngredient(ReferenceStorage.im.nameToIngredient(input));
            }
            else {
                System.out.println("Ingredient '" + input + "' Doesn't exist");
                System.out.println("Input attributes to create:");
                String att = sc.nextLine()

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
