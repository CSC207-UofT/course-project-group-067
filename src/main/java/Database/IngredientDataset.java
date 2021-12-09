package Database;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class IngredientDataset implements Dataset {
    private final Statement s;

    public IngredientDataset(Statement s) {
        this.s = s;

    }

    @Override
    public ArrayList<String> getData() throws SQLException {
        ArrayList<String> data = new ArrayList<>();

        ResultSet r = s.executeQuery("SELECT * FROM ingredients");

        while (r.next()) {
            String name = r.getString("name").toLowerCase().strip();
            String attributes = r.getString("attributes").toLowerCase().strip();
            data.add(name + "@" + attributes);
        }

        return data;
    }

}
