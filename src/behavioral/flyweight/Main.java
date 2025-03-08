package behavioral.flyweight;

import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        ShapeFactory shapeFactory = new ShapeFactory();
        Shape red = shapeFactory.getShape("red");

        Random random = new Random();

        List<String> colors = List.of("red" , "blue", "green", "yellow", "dark");

        for (int i = 0; i < 100; i++) {

            var colorIndex = random.nextInt(0, colors.size());
            int x = random.nextInt(100, 1000);
            int y = random.nextInt(100, 1000);
            String color = colors.get(colorIndex);

            Shape shape = shapeFactory.getShape(color);
            shape.draw(x, y);
        }

    }
}
