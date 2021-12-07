package Controller;

import Entities.Dish;
import Entities.Ingredient;
import ObjectConversion.ReferenceStorage;
import Presenter.BookView;
import Presenter.OpenSesame;
import Search.Search;
import Serialization.AddToDB;

import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Scanner;

public class BookConsole implements AbstractConsole {
    private Controller.CreateExecutor CreateExecutor = new CreateExecutor();
    private CreateOperation CreateDish = new CreateDishOperation();
    private CreateOperation CreateIngredient= new CreateIngredientOperation();
    private GetExecutor GetExecutor = new GetExecutor();
    private GetPrefDishes prefDishes = new GetPrefDishes();
    private GetFavouriteOperation GetFav = new GetFavouriteOperation();

    public void run(String input) throws IOException, SQLException {
        Scanner sc = new Scanner(System.in);

        if(ReferenceStorage.dm.getDishNames().contains(input)){
            Dish dishToView = ReferenceStorage.dm.nameToDish(input);
            System.out.println(dishToView.toString());
            return;
        }
        if(ReferenceStorage.im.getIngredientNames().contains(input)){
            Ingredient ingredientToView = ReferenceStorage.im.nameToIngredient(input);
            System.out.println(ingredientToView.toString());
            return;
        }
        if(input.matches("search .*")){
            BookView.view(Search.find(input));
            return;
        }

        switch (input) {
            case "view dishes" : BookView.view();
                break;
            case "view ingredients" : BookView.ingredientsView();
                break;
            case "view ingredient" :
                System.out.println("Which ingredient would you like to view?");
                Ingredient ingredientToView = ReferenceStorage.im.nameToIngredient(sc.nextLine().toLowerCase());
                System.out.println(ingredientToView.toString());
                break;
            case "favourites" : BookView.view((ArrayList<Dish>) GetExecutor.grab(GetFav));
                break;
            case "add to favourites" :
                System.out.println("Which dish would you like to add to favourites?");
                String dishName1 = sc.nextLine().toLowerCase();
                Dish d1 = ReferenceStorage.dm.nameToDish(dishName1);
                ReferenceStorage.u.addFavourite(d1);
                new AddToDB().SetFavourites(ReferenceStorage.u);
                break;
            case "remove from favourites" :
                System.out.println("Which dish would you like to remove from favourites?");
                String dishName2 = sc.nextLine().toLowerCase();
                Dish d2 = ReferenceStorage.dm.nameToDish(dishName2);
                ReferenceStorage.u.removeFavourite(d2);
                new AddToDB().SetFavourites(ReferenceStorage.u);
                break;
            case "preferences" : BookView.view((ArrayList<Dish>) GetExecutor.grab(prefDishes)); //preferenceSearch
                break;
            case "create dish" :
                CreateExecutor.genesis(CreateDish);
                break;
            case "create ingredient" :
                CreateExecutor.genesis(CreateIngredient);
                break;
            default : throw new IllegalStateException("Unexpected Command/Dish: " + input);
        }
    }
}
