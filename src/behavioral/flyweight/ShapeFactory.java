package behavioral.flyweight;

import java.util.HashMap;
import java.util.Map;

public class ShapeFactory {
    public static Map<String, Shape> shapeMap = new HashMap<>();

    public Shape getShape(String color) {
        Shape shape = shapeMap.computeIfAbsent(color, Circle::new);
        return shape;
    }
}
