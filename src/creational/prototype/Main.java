package creational.prototype;

public class Main {
    public static void main(String[] args) {
        Shape circle = ShapeRegister.getShape("circle");
        Shape rectangle = ShapeRegister.getShape("rectangle");

        circle.draw();
        rectangle.draw();


    }
}
