package creational.prototype;

import java.util.Hashtable;

/**
 * @author Seyyed Mahdiyar Zerehpoush
 */
public class ShapeCache {
    private static Hashtable<String, Shape> shapeHashtable = new Hashtable<>();

    public static Shape getShape(String shapeId) {
        Shape cachedShape = shapeHashtable.get(shapeId);
        if (cachedShape == null)
            return null;
        return (Shape) cachedShape.clone();
    }

    public static void addToCache(Shape shape) {
        if (shape == null)
            return;
        shapeHashtable.put(shape.getId(), shape);
    }

}
