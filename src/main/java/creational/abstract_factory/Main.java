package creational.abstract_factory;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Seyyed Mahdiyar Zerehpoush
 */
public class Main {
    public static void main(String[] args) {
        List<Shape> shapes = new ArrayList<>();
        AbstractShapeFactory abstractShapeFactory = FactoryProducer.getShapeFactory();
        shapes.add(abstractShapeFactory.getShape(ShapeType.RECTANGLE));
        shapes.add(abstractShapeFactory.getShape(ShapeType.SQUARE));
        abstractShapeFactory = FactoryProducer.getRoundedShapeFactory();
        shapes.add(abstractShapeFactory.getShape(ShapeType.ROUNDED_RECTANGLE));
        shapes.add(abstractShapeFactory.getShape(ShapeType.ROUNDED_SQUARE));
        shapes.forEach(Shape::draw);

    }
}
