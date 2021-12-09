package Controller;

import Entities.Ingredient;
import EntityCreation.EntityCreatorDistributor;
import ObjectConversion.ReferenceStorage;
import Serialization.AddToDB;

import java.sql.SQLException;

public class CreateIngredientOperation implements CreateOperation {
    public void execute() throws SQLException {
        Ingredient i = EntityCreatorDistributor.distribute("INGREDIENT", "").create();

        ReferenceStorage.im.addIngredientToList(i);
        new AddToDB().AddIngredient(i);
    }

    public void execute(String data) throws SQLException {
        Ingredient i = EntityCreatorDistributor.distribute("INGREDIENT", data).create();

        ReferenceStorage.im.addIngredientToList(i);
        new AddToDB().AddIngredient(i);
    }
}
