package behavioral.template.design;

public class Pilot extends Worker {
    @Override
    void wakeUp() {
        System.out.println("wakeup as pilot");
    }

    @Override
    void work() {
        System.out.println("fight");
    }

    @Override
    void sleep() {
        System.out.println("sleep as pilot");
    }
}
