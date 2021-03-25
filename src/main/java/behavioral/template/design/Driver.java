package behavioral.template.design;

public class Driver extends Worker {
    @Override
    void wakeUp() {
        System.out.println("wakeup as driver");
    }

    @Override
    void work() {
        System.out.println("driver");
    }

    @Override
    void sleep() {
        System.out.println("sleep as driver");
    }
}
