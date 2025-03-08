package behavioral.interpreter;

public class Main {
    public static void main(String[] args) {
        Expression number = new Number(10);
        Expression number2 = new Number(5);
        Expression number3 = new Number(15);

        Expression addition = new Addition(number, number2);
        Expression subt = new Subtraction(addition, number3);
        System.out.println(subt.interpret());
    }
}
