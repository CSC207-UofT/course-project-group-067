package Controller;

public class GetExecutor {
    public Object grab(GetOperation operation) {
        return operation.execute();
    }
}
