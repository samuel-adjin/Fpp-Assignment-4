package problemthree;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;


public class SoundSensor implements Sensor {

    private String location;
    private LocalTime lastUpdated;
    private double soundLevel;


    public SoundSensor(String location, double soundLevel) {
        this.location = location;
        this.soundLevel = soundLevel;
        this.lastUpdated = LocalTime.now();
    }

    @Override
    public String getSensorType() {
        return "Sound";
    }

    @Override
    public double getReading() {
        return this.soundLevel;
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
        if(soundLevel > 70.0){
            return "Sound Level is too high! Turning on noise cancellation";
        }else{
            return "Sound is within normal range";
        }
    }

    @Override
    public String toString() {
        return
                "Sensor Type: " +  this.getSensorType() + "\n" +
                "Reading: " + this.getReading() + "\n" +
                "Location: " + this.getLocation() + "\n" +
                "Last Updated: " + this.getLastUpdated() + "\n" +
                "Action: " + this.performAction();
    }
}
