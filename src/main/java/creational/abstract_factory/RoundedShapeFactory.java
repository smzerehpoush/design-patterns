package creational.abstract_factory;

/**
 * @author Seyyed Mahdiyar Zerehpoush
 */
public class RoundedShapeFactory implements AbstractShapeFactory {
    @Override
    public Shape getShape(ShapeType shapeType) {
        switch (shapeType) {
            case ROUNDED_RECTANGLE:
                return new RoundedRectangle();
            case ROUNDED_SQUARE:
                return new RoundedSquare();
            default:
                throw new RuntimeException("This Factory Can Not Build Other Types.");
        }
    }
}
