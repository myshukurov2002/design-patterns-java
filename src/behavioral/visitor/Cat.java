package behavioral.visitor;

public class Cat implements Animal{
    @Override
    public void accept(AnimalVisitor animalVisitor) {
        animalVisitor.visit(this);
    }
}
