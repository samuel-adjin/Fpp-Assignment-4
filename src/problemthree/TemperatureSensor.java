package problemthree;

import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class TemperatureSensor implements Sensor {

    private String location;
    private LocalTime lastUpdated;
    private double temperature;

    public TemperatureSensor(String location, double temperature) {
        this.location = location;
        this.temperature = temperature;
        this.lastUpdated = LocalTime.now();
    }

    @Override
    public String getSensorType() {
        return "Temperature";
    }

    @Override
    public double getReading() {
        return this.temperature;
    }

    @Override
    public String getLocation() {

        return this.location;
    }

    @Override
    public String getLastUpdated() {
        LocalTime currentTime = LocalTime.now();
        this.lastUpdated = currentTime;
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("hh:mm a");
        return currentTime.format(dateTimeFormatter);
    }

    @Override
    public String performAction() {
        if (temperature > 30.0) {
            return "Temperature is too high! Turning on the AC";
        } else if (temperature < 18.0) {
            return "Temperature is too low! Turning on the Heater";
        } else {
            return "Temperature is within normal range";
        }
    }

    @Override
    public String toString() {
        return  "Sensor Type: " + this.getSensorType() + "\n" +
                "Reading: " + this.getReading() + "\n" +
                "Location: " + this.getLocation() + "\n" +
                "Last Updated: " + this.getLastUpdated() + "\n" +
                "Action: " + this.performAction();
    }
}
