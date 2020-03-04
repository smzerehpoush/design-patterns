package creational.singleton;

import java.util.Date;

/**
 * @author Seyyed Mahdiyar Zerehpoush
 */
public class SimpleSingletonClass {
    private final static SimpleSingletonClass INSTANCE = new SimpleSingletonClass();
    private String message;

    private SimpleSingletonClass() {
        this.message = "Time In Simple Singleton Class : " + new Date();
    }

    public static SimpleSingletonClass getInstance() {
        return INSTANCE;
    }

    public String getMessage() {
        return message;
    }
}

