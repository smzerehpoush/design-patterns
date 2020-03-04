package creational.abstract_factory;

/**
 * @author Seyyed Mahdiyar Zerehpoush
 */
public class ShapeFactory implements AbstractShapeFactory {
    @Override
    public Shape getShape(ShapeType shapeType) {
        switch (shapeType) {
            case RECTANGLE:
                return new Rectangle();
            case SQUARE:
                return new Square();
            default:
                throw new RuntimeException("This Factory Can Not Build Other Types.");
        }
    }
}
