package creational.prototype;

/**
 * @author Seyyed Mahdiyar Zerehpoush
 */
public class Main {
    public static void main(String[] args) {
        Square square = new Square("1");
        ShapeCache.addToCache(square);
        Rectangle rectangle = new Rectangle("2");
        ShapeCache.addToCache(rectangle);

        ShapeCache.getShape("1").draw();
        ShapeCache.getShape("2").draw();
    }
}
