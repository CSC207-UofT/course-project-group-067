package EntityCreation.IngredientCreation;

import Entities.Ingredient;
import EntityCreation.BuilderFramework;

import java.util.Scanner;

@SuppressWarnings("ALL")
abstract class IngredientBuilder extends BuilderFramework {
    Scanner sc = new Scanner(System.in);
    Ingredient ingredient;

    abstract void buildName();

    abstract void buildAttribute();

    @Override
    public Ingredient getObject() {
        return ingredient;
    }

    @Override
    public void createObject() {
        ingredient = new Ingredient();
    }
}