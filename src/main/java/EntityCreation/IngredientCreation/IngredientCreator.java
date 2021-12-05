package EntityCreation.IngredientCreation;

import Entities.Ingredient;
import EntityCreation.EntityCreator;

public class IngredientCreator implements EntityCreator {
    private String data;

    public IngredientCreator(String data){
        this.data = data;
    }

    public Ingredient create(){
        IngredientBuilderDirector ingredientBuilderDirector = new IngredientBuilderDirector();
        IngredientBuilder ingredientBuilder;

        if(data.equals(""))
            ingredientBuilder = new RuntimeIngredientBuilder();
        else
            ingredientBuilder = new FileIngredientBuilder(data);

        ingredientBuilderDirector.setIngredientBuilder(ingredientBuilder);
        ingredientBuilderDirector.construct();

        return ingredientBuilderDirector.getIngredient();


    }

}