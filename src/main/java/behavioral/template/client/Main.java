package behavioral.template.client;

import behavioral.template.design.Driver;
import behavioral.template.design.Pilot;
import behavioral.template.design.Worker;

public class Main {
    public static void main(String[] args) {
        Worker pilot = new Pilot();
        pilot.doJob();

        Worker driver = new Driver();
        driver.doJob();
    }
}
