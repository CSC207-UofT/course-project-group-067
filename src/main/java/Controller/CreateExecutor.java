package Controller;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class CreateExecutor {
    private final List<CreateOperation> operationList = new ArrayList<>();

    public void genesis(CreateOperation operation) throws SQLException {
        operationList.add(operation);
        operation.execute();
    }

//Not used in UI interface but applied for other front ends
    public void genesis(CreateOperation operation, String data) throws SQLException {
        operationList.add(operation);
        operation.execute(data);

    }

}
