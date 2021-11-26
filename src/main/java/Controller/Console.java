package Controller;

import EntityCreation.EntityCreatorDistributor;
import ObjectConversion.ReferenceStorage;
import Presenter.BookView;
import Presenter.OpenSesame;
import Search.Search;
import Serialization.SerializationClass;

import java.io.IOException;
import java.util.Scanner;

public class Console {
    static Scanner sc = new Scanner(System.in);

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
            case "Add to Favourites" :
                System.out.println("Which dish would you like to add to favourites?");
                String dishname = sc.nextLine().strip();
                Entities.Dish d = ReferenceStorage.dm.nameToDish(dishname);
                ReferenceStorage.u.addFavourite(d);
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
                SerializationClass.umWrite();
                SerializationClass.dmWrite();
                SerializationClass.imWrite();
                break;
            default : throw new IllegalStateException("Unexpected Command/Entities.Dish: " + input);
        }
    }
}
