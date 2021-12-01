package Database;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class UserDataset implements Dataset{
    private Statement s;

    public UserDataset(Statement s){
        this.s = s;

    }

    @Override
    public ArrayList<String> getData() throws SQLException {
        ArrayList<String> data = new ArrayList<String>();

        ResultSet r = s.executeQuery("SELECT * FROM users");

        while (r.next()){
            String name = r.getString("name").toLowerCase();
            String favourites = r.getString("favourites").toLowerCase();
            String preferences = r.getString("preferences").toLowerCase();
            data.add(name+"@"+preferences+"@"+favourites);
        }
        return data;
    }
}
