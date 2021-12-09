package Database;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class UserDataset implements Dataset {
    private final Statement s;

    public UserDataset(Statement s) {
        this.s = s;

    }

    @Override
    public ArrayList<String> getData() throws SQLException {
        ArrayList<String> data = new ArrayList<>();

        ResultSet r = s.executeQuery("SELECT * FROM users");

        while (r.next()) {
            String name = r.getString("name").toLowerCase();
            String favourites = r.getString("favourites").toLowerCase();
            String preferences = r.getString("preferences").toLowerCase();
            String edit = r.getString("edit").toLowerCase();
            String password = r.getString("password".toLowerCase());
            data.add(name + "@" + preferences + "@" + favourites + "@" + edit + "@" + password);
        }
        return data;
    }
}
