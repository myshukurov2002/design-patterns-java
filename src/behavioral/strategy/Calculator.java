package behavioral.strategy;

public class Calculator implements Operation{

    private Operation operation;

    public Calculator(Operation operation) {
        this.operation = operation;
    }

    @Override
    public void operate(int a, int b) {
        operation.operate(a, b);
    }
}
