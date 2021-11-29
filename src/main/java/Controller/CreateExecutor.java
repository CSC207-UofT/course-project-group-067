package Controller;

import java.util.ArrayList;
import java.util.List;

public class CreateExecutor {
    private final List<CreateOperation> operationList = new ArrayList<>();

    public void genesis(CreateOperation operation) {
        operationList.add(operation);
        operation.execute();
    }
    public void genesis(CreateOperation day1, String data) {

    }

}
