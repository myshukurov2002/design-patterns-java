package behavioral.visitor;

public interface AnimalVisitor {
    void visit(Dog dog);
    void visit(Cat cat);
}
