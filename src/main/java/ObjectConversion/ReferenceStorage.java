package ObjectConversion;

import Entities.User;
import Managers.DishManager;
import Managers.IngredientManager;
import Managers.UserManager;

public class ReferenceStorage {
    public static DishManager dm = new DishManager();
    public static IngredientManager im = new IngredientManager();
    public static UserManager um = new UserManager();
    public static User u = null;

    public static void reset(){
        dm = new DishManager();
        im = new IngredientManager();
        um = new UserManager();
        u = null;
    }
}
