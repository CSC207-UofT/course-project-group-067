package Database;

import java.sql.SQLException;
import java.util.ArrayList;

public interface Dataset {

    ArrayList<String> getData() throws SQLException;
}
