package creational.singleton;

import java.util.Date;

/**
 * @author Seyyed Mahdiyar Zerehpoush
 */
public class LazySingletonClass {
    private static LazySingletonClass instance = null;
    private String message;

    private LazySingletonClass() {
        this.message = "Time in Lazy Singleton Class : " + new Date();
    }

    public static synchronized LazySingletonClass getInstance() {
        if (instance == null) {
            synchronized (LazySingletonClass.class) {
                if (instance == null)
                    instance = new LazySingletonClass();
            }
        }
        return instance;
    }

    public String getMessage() {
        return message;
    }
}
