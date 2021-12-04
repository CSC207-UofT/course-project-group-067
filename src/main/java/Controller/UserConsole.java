package Controller;

import ObjectConversion.ReferenceStorage;
import Presenter.BookView;
import Presenter.OpenSesame;
import Serialization.SerializationClass;

import java.io.IOException;

public class UserConsole implements AbstractConsole {

    public void run(String input) throws IOException {
        if (ReferenceStorage.dm.getDishNames().contains(input)) {
            OpenSesame.recipe(ReferenceStorage.dm.nameToDish(input));
            return;
        }

        switch (input) {
            case "Favourites":
                BookView.view(ReferenceStorage.u.getFavourites()); //names only
                break;
            case "Preferences":
                System.out.println(ReferenceStorage.u.getPreferences());
                break;
            case "Save":
                SerializationClass.umWrite();
                SerializationClass.dmWrite();
                SerializationClass.imWrite();
                break;
            default:
                throw new IllegalStateException("Unexpected Command/Entities.Dish: " + input);
        }
    }
}