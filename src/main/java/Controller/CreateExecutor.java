package Controller;

import java.sql.SQLException;

public class CreateExecutor {

    public void genesis(CreateOperation operation) throws SQLException {

        operation.execute();
    }

    public void genesis(CreateOperation operation, String data) throws SQLException {

        operation.execute(data);

    }

}
