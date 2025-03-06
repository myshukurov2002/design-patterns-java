package creational.prototype;

public class Circle implements Shape{

    private int radius;

    public Circle(int radius) {
        this.radius = radius;
    }

    @Override
    public Shape clone() {
        return new Circle(this.radius);
    }

    @Override
    public void draw() {
        System.out.println("Draw R=" + radius);
    }
}
