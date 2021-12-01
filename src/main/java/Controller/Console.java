package Controller;

import Entities.Ingredient;
import EntityCreation.EntityCreatorDistributor;
import ObjectConversion.ReferenceStorage;
import Presenter.BookView;
import Presenter.OpenSesame;
import Search.Search;
import Serialization.AddToDB;

import java.io.IOException;
import java.sql.SQLException;

public class Console {

    public void run(String input) throws IOException, SQLException {

        if(ReferenceStorage.dm.getDishNames().contains(input)){
            OpenSesame.recipe(ReferenceStorage.dm.nameToDish(input));
            return;
        }

        switch (input) {
            case "Search" : BookView.view(Search.find());
                break;
            case "View Dishes" : BookView.view();
                break;
            case "Favourites" : BookView.view(ReferenceStorage.u.getFavourites());
                break;
            case "Preferences" : System.out.println(ReferenceStorage.u.getPreferences());
                break;
            case "Create Dish" :
                ReferenceStorage.dm.addDishToList(EntityCreatorDistributor.distribute("DISH", "").create());

                break;
            case "Create Ingredient" :
                Ingredient i = EntityCreatorDistributor.distribute("INGREDIENT","").create();
                ReferenceStorage.im.addIngredientToList(i);
                new AddToDB().AddIngredient(i);
                break;
            default : throw new IllegalStateException("Unexpected Command/Entities.Dish: " + input);
        }
    }
}
