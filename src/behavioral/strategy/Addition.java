package behavioral.strategy;

public class Addition implements Operation{
    @Override
    public void operate(int a, int b) {
        System.out.println(a + b);
    }
}
