package Controller;

import EntityCreation.EntityCreatorDistributor;
import ObjectConversion.ReferenceStorage;
import Presenter.BookView;
import Presenter.OpenSesame;
import Search.Search;
import Serialization.SerializationClass;

import java.io.IOException;

public class Console {

    public void run(String input) throws IOException {

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
                ReferenceStorage.im.addIngredientToList(EntityCreatorDistributor.distribute("INGREDIENT","").create());
                break;
            case "Save" :
                SerializationClass.umWrite(ReferenceStorage.um);
                SerializationClass.dmWrite(ReferenceStorage.dm);
                SerializationClass.imWrite(ReferenceStorage.im);
                break;
            default : throw new IllegalStateException("Unexpected Command/Entities.Dish: " + input);
        }
    }
}
