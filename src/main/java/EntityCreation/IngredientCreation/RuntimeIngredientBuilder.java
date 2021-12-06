package EntityCreation.IngredientCreation;

public class RuntimeIngredientBuilder extends IngredientBuilder {
    @Override
    void buildName() {
        System.out.println("Enter Ingredient Name");
        String input = sc.nextLine().trim();
        ingredient.addName(input);
    }

    @Override
    void buildAttribute() {
        System.out.println("Enter attributes, Enter END to finish");
        String attribute = sc.nextLine().trim();
        while (!(attribute.equalsIgnoreCase("END"))){
            ingredient.addAttribute(attribute);
            attribute = sc.nextLine().trim();
        }
    }


}
