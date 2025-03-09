package behavioral.visitor;

public class FeedVisitor implements AnimalVisitor {

    @Override
    public void visit(Dog dog) {
        System.out.println("Dog feeding");
    }

    @Override
    public void visit(Cat cat) {
        System.out.println("Cat feeding");
    }
}
