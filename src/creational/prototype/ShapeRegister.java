package creational.prototype;

import java.util.HashMap;
import java.util.Map;

public class ShapeRegister {

    private static final Map<String, Shape> shapeMap = new HashMap<>();

    static {
        shapeMap.put("circle", new Circle(10));
        shapeMap.put("rectangle", new Rectangle(4, 5));
    }

    public static Shape getShape(String type) {
        return shapeMap.get(type).clone();
    }
}
