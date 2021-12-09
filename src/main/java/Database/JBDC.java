package Database;

import ObjectConversion.ReferenceStorage;

import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class JBDC {

    public static ArrayList<Dataset> getDatasets() throws SQLException {
        Statement statement = ReferenceStorage.connection.createStatement();
        return setCreator(statement);
    }

    private static ArrayList<Dataset> setCreator(Statement s) {
        ArrayList<Dataset> ret = new ArrayList<>();
        ret.add(new AttributeDataset(s));
        ret.add(new IngredientDataset(s));
        ret.add(new DishDataset(s));
        ret.add(new UserDataset(s));
        return ret;

    }

}

