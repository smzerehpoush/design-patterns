package creational.prototype;

/**
 * @author Seyyed Mahdiyar Zerehpoush
 */
public class Square extends Shape {
    public Square(String id) {
        super(ShapeType.SQUARE, id);
    }

    @Override
    void draw() {
        System.out.println("this is square.");
    }
}
