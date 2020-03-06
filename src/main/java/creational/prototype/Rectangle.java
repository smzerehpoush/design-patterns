package creational.prototype;

/**
 * @author Seyyed Mahdiyar Zerehpoush
 */
public class Rectangle extends Shape {
    public Rectangle(String id) {
        super(ShapeType.RECTANGLE, id);
    }

    @Override
    void draw() {
        System.out.println("this is rectangle");
    }
}
