package problemthree;

public interface Sensor {

    String getSensorType();
    double  getReading();
    String getLocation();
    String getLastUpdated();
    String  performAction();

}
