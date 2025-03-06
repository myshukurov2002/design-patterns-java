package creational.prototype;

public class Rectangle implements Shape{

    private int x;
    private int y;

    public Rectangle(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public Shape clone() {
        return new Rectangle(this.x, this.y);
    }

    @Override
    public void draw() {
        System.out.println("X=" + x + " " + "Y=" + y);
    }
}
