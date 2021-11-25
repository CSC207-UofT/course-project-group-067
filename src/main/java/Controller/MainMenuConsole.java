package Controller;

import EntityCreation.EntityCreatorDistributor;
import ObjectConversion.ReferenceStorage;
import Presenter.BookView;
import Presenter.OpenSesame;
import Search.Search;
import Serialization.SerializationClass;

import java.io.IOException;


public class MainMenuConsole implements AbstractConsole {
    private CreateExecutor CreateExecutor = new CreateExecutor();

    @Override
    public void run(String input) throws IOException {

        if(ReferenceStorage.dm.getDishNames().contains(input)){
            OpenSesame.recipe(ReferenceStorage.dm.nameToDish(input));
            return;
        }

        switch (input) {
            case "Save" :
                SerializationClass.umWrite();
                SerializationClass.dmWrite();
                SerializationClass.imWrite();
                break;
            default : throw new IllegalStateException("Unexpected Command/Entities.Dish: " + input);
        }
    }
}
