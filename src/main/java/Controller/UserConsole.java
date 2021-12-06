package Controller;

import ObjectConversion.ReferenceStorage;
import Presenter.BookView;
import Presenter.OpenSesame;

import java.io.IOException;

public class UserConsole implements AbstractConsole {

    public void run(String input) throws IOException {
        if (ReferenceStorage.dm.getDishNames().contains(input)) {
            OpenSesame.recipe(ReferenceStorage.dm.nameToDish(input));
            return;
        }

        switch (input) {
            case "favourites":
                BookView.view(ReferenceStorage.u.getFavourites()); //names only
                break;
            case "preferences":
                System.out.println(ReferenceStorage.u.getPreferences());
                break;
            default:
                throw new IllegalStateException("Unexpected Command/Entities.Dish: " + input);
        }
    }
}