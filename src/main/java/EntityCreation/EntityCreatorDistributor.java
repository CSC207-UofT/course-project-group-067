package EntityCreation;

import EntityCreation.DishCreation.DishCreator;
import EntityCreation.IngredientCreation.IngredientCreator;
import EntityCreation.UserCreation.UserCreator;

public class EntityCreatorDistributor {

    public static EntityCreator distribute(String type, String data) {
        if(type.equals("DISH"))
            return new DishCreator(data);
        else if(type.equals("INGREDIENT"))
            return new IngredientCreator(data);
        else if(type.equals("USER"))
            return new UserCreator(data);
        else
            throw new IllegalStateException("Unexpected Type: " + type);
    }

}
