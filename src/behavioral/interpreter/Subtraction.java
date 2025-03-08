package behavioral.interpreter;

public class Subtraction extends BinaryOperation{

    public Subtraction(Expression left, Expression right) {
        super(left, right);
    }

    @Override
    public int interpret() {
        return left.interpret() - right.interpret();
    }
}
