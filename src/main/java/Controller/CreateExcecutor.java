package Controller;

import java.util.ArrayList;
import java.util.List;

public class CreateExcecutor {
    private final List<CreateOperation> operationList = new ArrayList<>();

    public void genesis(CreateOperation day1) {
        operationList.add(day1);
        day1.execute();
    }
    public void genesis(CreateOperation day1, String data) {

    }

}
