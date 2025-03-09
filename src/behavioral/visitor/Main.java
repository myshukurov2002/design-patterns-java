package behavioral.visitor;

public class Main {
    public static void main(String[] args) {
        Animal dog = new Dog();
        Animal cat = new Cat();

        AnimalVisitor walkVisitor = new WalkVisitor();
        AnimalVisitor feedVisitor = new FeedVisitor();

        System.out.println("🦴 Sayr qilish:");
        dog.accept(walkVisitor);
        cat.accept(walkVisitor);

        System.out.println("\n🥩 Ovqatlantirish:");
        dog.accept(feedVisitor);
        cat.accept(feedVisitor);
    }
}
