package EntityCreation.IngredientCreation;


import Entities.Ingredient;

public class IngredientBuilderDirector {
    private IngredientBuilder ingredientBuilder;

    public void setIngredientBuilder(IngredientBuilder ingredientBuilder) {
        this.ingredientBuilder = ingredientBuilder;
    }

    public Ingredient getIngredient() {
        return ingredientBuilder.getObject();
    }

    public void construct() {
        ingredientBuilder.createObject();
        ingredientBuilder.buildName();
        ingredientBuilder.buildAttribute();
    }
}