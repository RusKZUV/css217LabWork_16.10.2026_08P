package task03_adapter_temperature;

public class SensorAdapter implements CelsiusThermometer {
    private final FahrenheitSensor sensor;

    public SensorAdapter(FahrenheitSensor sensor) {
        this.sensor = sensor;
    }


    public double getTemperatureC() {
        double fahr = sensor.readFahrenheit();
        return (fahr - 32.0) * 5.0 / 9.0;
    }
}