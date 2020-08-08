package creational.prototype;

import java.util.logging.Logger;

/**
 * @author Seyyed Mahdiyar Zerehpoush
 */
public class Main {
    private static final Logger logger = Logger.getLogger(Main.class.getName());

    public static void main(String[] args) {
        Shape shape = new Shape("1", 1, 2);
        Shape copy = new Shape(shape);
        logger.info("shape : " + shape);
        logger.info("copy : " + copy);
    }
}
