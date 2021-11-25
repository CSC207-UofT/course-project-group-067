package Controller;

import ObjectConversion.ReferenceStorage;
import Presenter.BookView;

import java.io.IOException;

public class UserConsole implements AbstractConsole {
    @Override
    public void run(String input) throws IOException {
        switch (input) {
            case "Favourites" : BookView.view(ReferenceStorage.u.getFavourites());
                break;
            case "Preferences" : System.out.println(ReferenceStorage.u.getPreferences());
                break;
        }


    }
}
