package Controller;

import java.sql.SQLException;

public interface CreateOperation {
    void execute() throws SQLException;

    void execute(String data) throws SQLException;
}
