package Serialization;

import Database.Dataset;
import Entities.Dish;
import Entities.Ingredient;
import Entities.User;
import EntityCreation.DishCreation.DishCreator;
import EntityCreation.IngredientCreation.IngredientCreator;
import EntityCreation.UserCreation.UserCreator;
import ObjectConversion.ReferenceStorage;

import java.sql.SQLException;
import java.util.ArrayList;

public class Initialize {
    ArrayList<String> attributes;
    ArrayList<String> ingredients;
    ArrayList<String> dishes;
    ArrayList<String> users;

    public Initialize(ArrayList<Dataset> data) throws SQLException {
        attributes = data.get(0).getData();
        ingredients = data.get(1).getData();
        dishes = data.get(2).getData();
        users = data.get(3).getData();
    }

    public void initializeAttributes() {
        ReferenceStorage.attributes.addAll(attributes);
    }

    public void initializeIngredients() {
        for (String data : ingredients) {
            IngredientCreator ic = new IngredientCreator(data);
            Ingredient i = ic.create();
            ReferenceStorage.im.addIngredientToList(i);

        }
    }

    public void initializeDishes() {
        for (String data : dishes) {
            DishCreator dc = new DishCreator(data);
            Dish d = dc.create();
            ReferenceStorage.dm.addDishToList(d);
        }
    }

    public void initializeUsers() {
        for (String data : users) {
            UserCreator uc = new UserCreator(data);
            User u = uc.create();
            ReferenceStorage.um.addUser(u);
        }
    }
}
