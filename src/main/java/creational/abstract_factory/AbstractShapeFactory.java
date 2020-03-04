package creational.abstract_factory;

/**
 * @author Seyyed Mahdiyar Zerehpoush
 */
public interface AbstractShapeFactory {
    Shape getShape(ShapeType shapeType);
}
