package Controller;

import EntityCreation.EntityCreatorDistributor;
import ObjectConversion.ReferenceStorage;
import Presenter.BookView;
import Presenter.OpenSesame;
import Search.Search;
import Serialization.SerializationClass;

import java.io.IOException;

public class Console {
    private CreateExcecutor CreateExcecutor = new CreateExcecutor();
    private CreateOperation CreateDish = new CreateDishOperation();
    private CreateIngredientOperation CreateIngredient= new CreateIngredientOperation();

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
                CreateExcecutor.genesis(CreateDish);
                break;
            case "Create Ingredient" :
                CreateExcecutor.genesis(CreateIngredient);
                break;
            case "Save" :
                SerializationClass.umWrite();
                SerializationClass.dmWrite();
                SerializationClass.imWrite();
                break;
            default : throw new IllegalStateException("Unexpected Command/Entities.Dish: " + input);
        }
    }
}
