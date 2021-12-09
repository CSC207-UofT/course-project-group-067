package EntityCreation;

import EntityCreation.DishCreation.DishCreator;
import EntityCreation.IngredientCreation.IngredientCreator;
import EntityCreation.UserCreation.UserCreator;

public class EntityCreatorDistributor {

    public static EntityCreator distribute(String type, String data) {
        switch (type) {
            case "DISH":
                return new DishCreator(data);
            case "INGREDIENT":
                return new IngredientCreator(data);
            case "USER":
                return new UserCreator(data);
            default:
                throw new IllegalStateException("Unexpected Type: " + type);
        }
    }

}
