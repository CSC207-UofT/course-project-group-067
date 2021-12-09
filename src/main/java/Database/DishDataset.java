package Database;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class DishDataset implements Dataset {
    private final Statement s;

    public DishDataset(Statement s) {
        this.s = s;

    }

    @Override
    public ArrayList<String> getData() throws SQLException {
        ArrayList<String> data = new ArrayList<>();

        ResultSet r = s.executeQuery("SELECT * FROM dishes");

        while (r.next()) {
            String name = r.getString("name").toLowerCase().strip();
            String ingredients = r.getString("ingredients").toLowerCase().strip();
            String instructions = r.getString("instructions").toLowerCase().strip();
            String time = r.getString("time").toLowerCase().strip();
            data.add(name + "@" + time + "@" + ingredients + "@" + instructions);
        }
        return data;
    }

}
