package structural.bridge;

/**
 * @author Seyyed Mahdiyar Zerehpoush
 */
public class Television implements Device {
    private static final int MAX_VOLUME = 50;
    private int volume = 20;
    private int channel = 3;
    private boolean on = true;

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
        System.out.println("Hello!");
    }

    @Override
    public void disable() {
        System.out.println("Good Bye.");
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
        System.out.println(String.format("----TV----\n" +
                        "power status : %s\n" +
                        "volume : %s\n" +
                        "channel : %s\n",
                this.on ? "On" : "Off",
                this.volume,
                this.channel));
    }
}
