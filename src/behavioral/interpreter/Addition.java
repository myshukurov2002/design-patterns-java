package behavioral.interpreter;

public class Addition extends BinaryOperation{

    public Addition(Expression left, Expression right) {
        super(left, right);
    }

    @Override
    public int interpret() {
        return left.interpret() + right.interpret();
    }
}
