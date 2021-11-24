package Controller;

import EntityCreation.EntityCreatorDistributor;
import ObjectConversion.ReferenceStorage;

public class CreateIngredientOperation implements CreateOperation{
    public void execute() {
        ReferenceStorage.im.addIngredientToList(
                EntityCreatorDistributor.distribute("INGREDIENT","").create());
    }
}
