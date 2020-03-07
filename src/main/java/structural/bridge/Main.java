package structural.bridge;

/**
 * @author Seyyed Mahdiyar Zerehpoush
 */
public class Main {
    public static void main(String[] args) {
        testDevice(new Television());
        testDevice(new Radio());
    }

    public static void testDevice(Device device) {
        System.out.println("Tests with basic remote.");
        BasicRemoteController basicRemote = new BasicRemoteController(device);
        basicRemote.power();
        device.printStatus();

        System.out.println("Tests with advanced remote.");
        AdvancedRemoteController advancedRemote = new AdvancedRemoteController(device);
        advancedRemote.power();
        advancedRemote.mute();
        device.printStatus();
    }
}
