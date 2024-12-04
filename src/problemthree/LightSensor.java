package problemthree;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class LightSensor implements Sensor {

    private String location;
    private LocalTime lastUpdated;
    private double  lightLevel;

    public LightSensor(String location, double lightLevel) {
        this.location = location;
        this.lightLevel = lightLevel;
        this.lastUpdated = LocalTime.now();
    }

    @Override
    public String getSensorType() {
        return "Light";
    }

    @Override
    public double getReading() {
        return this.lightLevel;
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
        if(lightLevel < 100){
            return "Light level is too low! Turning on the lights";
        }else{
            return "Light is sufficient";
        }

    }

    @Override
    public String toString() {
        return "Sensor Type: " +  this.getSensorType() + "\n" +
                "Reading: " + this.getReading() + "\n" +
                "Location: " + this.getLocation() + "\n" +
                "Last Updated: " + this.getLastUpdated() + "\n" +
                "Action: " + this.performAction();
    }
}
