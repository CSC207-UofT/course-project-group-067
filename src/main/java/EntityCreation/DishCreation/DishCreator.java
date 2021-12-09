package EntityCreation.DishCreation;

import Entities.Dish;
import EntityCreation.EntityCreator;

public class DishCreator implements EntityCreator {
    private final String data; //name@time@ingredients@method

    public DishCreator(String data) {
        this.data = data;
    }

    @SuppressWarnings("unchecked")
    public Dish create() {
        DishBuilderDirector dishBuilderDirector = new DishBuilderDirector();
        DishBuilder dishBuilder;

        if (data.equals(""))
            dishBuilder = new RuntimeDishBuilder();
        else
            dishBuilder = new FileDishBuilder(data);

        dishBuilderDirector.setDishBuilder(dishBuilder);
        dishBuilderDirector.construct();


        return dishBuilderDirector.getDish();


    }
}
