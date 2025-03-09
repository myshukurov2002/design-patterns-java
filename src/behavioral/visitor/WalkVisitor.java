package behavioral.visitor;

public class WalkVisitor implements AnimalVisitor{
    @Override
    public void visit(Dog dog) {
        System.out.println("Dog running");
    }

    @Override
    public void visit(Cat cat) {
        System.out.println("Cat running");
    }
}
