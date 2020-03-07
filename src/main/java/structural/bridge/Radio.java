package structural.bridge;

/**
 * @author Seyyed Mahdiyar Zerehpoush
 */
public class Radio implements Device {
    private static final int MAX_VOLUME = 30;
    private int volume = 10;
    private int channel = 2;
    private boolean on = false;

    @Override
    public int getVolume() {
        return this.volume;
    }

    @Override
    public void setVolume(int volume) {
        if (volume > MAX_VOLUME)
            this.volume = MAX_VOLUME;
        else if (volume < 0)
            this.volume = 0;
        else
            this.volume = volume;
    }

    @Override
    public boolean isEnabled() {
        return this.on;
    }

    @Override
    public void enable() {
        this.on = true;
    }

    @Override
    public void disable() {
        this.on = false;
    }

    @Override
    public int getChannel() {
        return this.channel;
    }

    @Override
    public void setChannel(int channel) {
        this.channel = channel;
    }

    @Override
    public void printStatus() {
        System.out.println(String.format("----Radio----\n" +
                        "power status : %s\n" +
                        "volume : %s\n" +
                        "channel : %s\n",
                this.on ? "On" : "Off",
                this.volume,
                this.channel));
    }
}
