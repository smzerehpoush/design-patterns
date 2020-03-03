package creational.factory;

import java.util.logging.Logger;

/**
 * @author Seyyed Mahdiyar Zerehpoush
 */
public class Main {
    private static Logger logger = Logger.getGlobal();

    public static void main(String[] args) {
        Product product = ProductFactory.getProduct("My");
        MyProduct myProduct = (MyProduct) product;
        logger.info(myProduct.getName());
        Product product2 = ProductFactory.getProduct("Another");
        AnotherProduct anotherProduct = (AnotherProduct) product2;
        logger.info(anotherProduct.getName());
        try {
            Product nonExistenceProduct = ProductFactory.getProduct("NonExistence");
            logger.info(nonExistenceProduct.getName());
        } catch (Exception ex) {
            logger.info("non existence product type : " + ex.getMessage());
        }

    }
}
