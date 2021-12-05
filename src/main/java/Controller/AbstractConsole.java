package Controller;

import java.io.IOException;
import java.sql.SQLException;

public interface AbstractConsole {
    void run(String input) throws IOException, SQLException;
}
