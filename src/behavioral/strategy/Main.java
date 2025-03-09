package behavioral.strategy;

public class Main {

    public static void main(String[] args) {
        Operation add = new Addition();
        Operation sub = new Subtraction();

        Calculator calculator = new Calculator(add);
        calculator.operate(4, 5);

        calculator = new Calculator(sub);
        calculator.operate(6, 7);
    }
}
