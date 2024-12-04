package problemthree;

public class SensorTest {
    public static void main(String[] args) {
        LightSensor lightSensor1 = new LightSensor("Garden",80.0);
        LightSensor lightSensor2 = new LightSensor("Living Room",100.1);

        SoundSensor soundSensor1 = new SoundSensor("Bedroom",65.0);
        SoundSensor soundSensor2 = new SoundSensor("Kitchen",77.5);

        TemperatureSensor temperatureSensor1 = new TemperatureSensor("Living Room",23.5);

        Sensor[] sensors = {lightSensor1, lightSensor2, soundSensor1, soundSensor2,temperatureSensor1};

        for (Sensor sensor : sensors) {
            System.out.println(sensor);
            System.out.println("--------------------------------------");
        }
    }
}
