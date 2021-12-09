package Database;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class AttributeDataset implements Dataset {
    private final Statement s;

    AttributeDataset(Statement s) {
        this.s = s;
    }

    @Override
    public ArrayList<String> getData() throws SQLException {
        ArrayList<String> data = new ArrayList<>();

        ResultSet r = s.executeQuery("SELECT * FROM attributes");

        while (r.next()) {
            data.add(r.getString("name").toLowerCase().strip());
        }
        return data;
    }
}
