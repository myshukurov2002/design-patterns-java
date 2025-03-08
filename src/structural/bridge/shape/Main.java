package structural.bridge.shape;

public class Main {
    public static void main(String[] args) {

        Shape triangle = new Triangle(new Red());
        triangle.draw();

        Shape circle = new Circle(new Blue());
        circle.draw();
    }
}
