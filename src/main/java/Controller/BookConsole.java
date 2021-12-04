package Controller;

import Entities.Dish;
import ObjectConversion.ReferenceStorage;
import Presenter.BookView;
import Presenter.OpenSesame;
import Search.Search;
import Serialization.SerializationClass;

import java.io.IOException;
import java.util.ArrayList;

public class BookConsole implements AbstractConsole {
    private Controller.CreateExecutor CreateExecutor = new CreateExecutor();
    private CreateOperation CreateDish = new CreateDishOperation();
    private CreateIngredientOperation CreateIngredient= new CreateIngredientOperation();
    private GetExecutor GetExecutor = new GetExecutor();
    private GetPrefDishes prefDishes = new GetPrefDishes();
    private GetFavouriteOperation GetFav = new GetFavouriteOperation();

    public void run(String input) throws IOException {

        if(ReferenceStorage.dm.getDishNames().contains(input)){
            OpenSesame.recipe(ReferenceStorage.dm.nameToDish(input));
            return;
        }

        switch (input) {
            case "search" : BookView.view(Search.find());
                break;
            case "view dishes" : BookView.view();
                break;
            case "favourites" : BookView.view((ArrayList<Dish>) GetExecutor.grab(GetFav));
                break;
            case "preferences" : BookView.view((ArrayList<Dish>) GetExecutor.grab(prefDishes)); //preferenceSearch
                break;
            case "create dish" :
                CreateExecutor.genesis(CreateDish);
                break;
            case "create ingredient" :
                CreateExecutor.genesis(CreateIngredient);
                break;
            case "save" :
                SerializationClass.umWrite();
                SerializationClass.dmWrite();
                SerializationClass.imWrite();
                break;
            default : throw new IllegalStateException();
        }
    }
}
