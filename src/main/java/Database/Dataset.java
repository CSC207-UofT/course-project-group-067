package Database;

import java.sql.SQLException;
import java.util.ArrayList;

public interface Dataset {

    public ArrayList<String> getData() throws SQLException;
}
