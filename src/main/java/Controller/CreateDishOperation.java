package Controller;

import Entities.Dish;
import EntityCreation.AttributeAllocation;
import EntityCreation.EntityCreatorDistributor;
import ObjectConversion.ReferenceStorage;
import Serialization.AddToDB;

import java.sql.SQLException;

public class CreateDishOperation implements CreateOperation {

    public void execute() throws SQLException {
        Dish d = EntityCreatorDistributor.distribute("DISH", "").create();
        AttributeAllocation.allocate(d);
        ReferenceStorage.dm.addDishToList(d);
        new AddToDB().AddDish(d);
    }

    public void execute(String data) throws SQLException {
        Dish d = EntityCreatorDistributor.distribute("DISH", data).create();
        AttributeAllocation.allocate(d);
        ReferenceStorage.dm.addDishToList(d);
        new AddToDB().AddDish(d);
    }

}
