package Controller;

import Entities.Dish;
import ObjectConversion.ReferenceStorage;
import Presenter.BookView;
import Presenter.OpenSesame;
import Search.Search;

import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;

public class BookConsole implements AbstractConsole {
    private Controller.CreateExecutor CreateExecutor = new CreateExecutor();
    private CreateOperation CreateDish = new CreateDishOperation();
    private CreateOperation CreateIngredient= new CreateIngredientOperation();
    private GetExecutor GetExecutor = new GetExecutor();
    private GetPrefDishes prefDishes = new GetPrefDishes();
    private GetFavouriteOperation GetFav = new GetFavouriteOperation();

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
            case "Favourites" : BookView.view((ArrayList<Dish>) GetExecutor.grab(GetFav));
                break;
            case "Preferences" : BookView.view((ArrayList<Dish>) GetExecutor.grab(prefDishes)); //preferenceSearch
                break;
            case "Create Dish" :
                CreateExecutor.genesis(CreateDish);
                break;
            case "Create Ingredient" :
                CreateExecutor.genesis(CreateIngredient);
                break;
            default : throw new IllegalStateException("Unexpected Command/Dish: " + input);
        }
    }
}
