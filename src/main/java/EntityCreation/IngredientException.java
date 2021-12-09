package EntityCreation;

import EntityCreation.IngredientCreation.IngredientCreator;

import java.util.Scanner;

public class IngredientException {
    final Scanner sc = new Scanner(System.in);

    public void run(String name) {
        System.out.println("Ingredient Doesn't Exist");
        System.out.println("Input attributes to Create Ingredient: 'DONE' when finished");
        StringBuilder data = new StringBuilder();
        data.append(name).append('@');
        String att = sc.nextLine();
        while (!(att.equals("DONE"))) {
            data.append(att).append(" ");
            att = sc.nextLine();
        }
        IngredientCreator IC = new IngredientCreator(data.toString());
        IC.create();
    }
}



