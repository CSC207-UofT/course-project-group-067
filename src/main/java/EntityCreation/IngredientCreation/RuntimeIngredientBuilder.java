package EntityCreation.IngredientCreation;

import ObjectConversion.ReferenceStorage;

public class RuntimeIngredientBuilder extends IngredientBuilder {
    @Override
    void buildName() {
        System.out.println("Enter Ingredient Name");
        String input = sc.nextLine().trim().toLowerCase();
        if (!(ReferenceStorage.im.getIngredientNames().contains(input)) && (input.length() > 0))
            ingredient.addName(input);
        else {
            System.out.println("Ingredient already exists/Invalid name , please enter a different name");
            buildName();
        }
    }

    @Override
    void buildAttribute() {
        System.out.println("Enter attributes, Enter end to finish");
        System.out.println("Available attributes: " + ReferenceStorage.attributes);
        String attribute = sc.nextLine().trim().toLowerCase();

        while (!(attribute.equals("end"))) {
            if (ReferenceStorage.attributes.contains(attribute)) {
                ingredient.addAttribute(attribute);
            } else {
                System.out.println("Attribute does not exist, retry");
            }
            attribute = sc.nextLine().trim();
        }
    }


}
