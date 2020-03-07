package structural.bridge;

/**
 * @author Seyyed Mahdiyar Zerehpoush
 */
public interface Device {
    int getVolume();

    void setVolume(int volume);

    boolean isEnabled();

    void enable();

    void disable();

    int getChannel();

    void setChannel(int channel);

    void printStatus();
}
