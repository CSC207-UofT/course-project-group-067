package Controller;

import ObjectConversion.ReferenceStorage;
import Presenter.BookView;
import Presenter.OpenSesame;
import Serialization.AddToDB;

import java.sql.SQLException;
import java.util.Scanner;

public class UserConsole implements AbstractConsole {

    public void run(String input) throws SQLException {
        Scanner sc = new Scanner(System.in);
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
            case "add to preferences":
                System.out.println("What preference would you like to add?");
                ReferenceStorage.u.addPreferences(sc.nextLine().toLowerCase());
                new AddToDB().SetPreferences(ReferenceStorage.u);
                break;
            case "remove from preferences":
                System.out.println("Which preference would you like to remove?");
                ReferenceStorage.u.removePreferences(sc.nextLine().toLowerCase());
                new AddToDB().SetPreferences(ReferenceStorage.u);
                break;
            default:
                throw new IllegalStateException("Unexpected Command/Dish: " + input);
        }
    }
}