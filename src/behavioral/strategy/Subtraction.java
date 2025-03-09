package behavioral.strategy;

public class Subtraction implements Operation{
    @Override
    public void operate(int a, int b) {
        System.out.println(a - b);
    }
}
