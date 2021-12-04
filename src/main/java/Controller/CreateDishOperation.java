package Controller;

import EntityCreation.EntityCreatorDistributor;
import ObjectConversion.ReferenceStorage;

public class CreateDishOperation implements CreateOperation{

    public void execute() {
        ReferenceStorage.dm.addDishToList(
                EntityCreatorDistributor.distribute("DISH", "").create());
    }

    public void execute(String data) {
        ReferenceStorage.dm.addDishToList(
                EntityCreatorDistributor.distribute("DISH", data).create());
    }

}
