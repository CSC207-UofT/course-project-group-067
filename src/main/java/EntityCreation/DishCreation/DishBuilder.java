package EntityCreation.DishCreation;

import java.util.Scanner;
import Entities.Dish;
import EntityCreation.BuilderFramework;

@SuppressWarnings("unchecked")
abstract class DishBuilder extends BuilderFramework {
    final Scanner sc = new Scanner(System.in);
    Dish dish;

    abstract void buildName();

    abstract void buildTime();

    abstract void buildIngredients();

    abstract void buildMethod();

    @Override
    public Dish getObject() {
        return dish;
    }

    @Override
    public void createObject() {
    dish = new Dish();
    }
}
