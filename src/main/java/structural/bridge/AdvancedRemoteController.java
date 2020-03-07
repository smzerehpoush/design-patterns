package structural.bridge;

/**
 * @author Seyyed Mahdiyar Zerehpoush
 */
public class AdvancedRemoteController extends BasicRemoteController {
    public AdvancedRemoteController(Device device) {
        super(device);
    }

    public void mute() {
        this.device.setVolume(0);
    }
}
