package EntityCreation.DishCreation;

import Entities.Dish;

public class DishBuilderDirector {
    private DishBuilder dishBuilder;

    public void setDishBuilder(DishBuilder dishBuilder) {
        this.dishBuilder = dishBuilder;

    }

    public Dish getDish() {
        return dishBuilder.getObject();
    }

    public void construct() {
        dishBuilder.createObject();
        dishBuilder.buildName();
        dishBuilder.buildTime();
        dishBuilder.buildIngredients();
        dishBuilder.buildMethod();

    }
}
