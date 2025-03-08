package behavioral.flyweight;

import java.util.Random;

public class Circle implements Shape{

    private String color;
    private int radius = 10;

    public Circle(String color) {
        this.color = color;
    }

    @Override
    public void draw(int x, int y) {
        System.out.println("Circle drawed, x=" + x + ", y=" + y + ", color=" + color);
    }

}
