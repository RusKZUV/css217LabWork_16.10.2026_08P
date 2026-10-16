package task03_adapter_temperature;

public class Task03 {
    public static void main(String[] args) {
        CelsiusThermometer t = new SensorAdapter(new FahrenheitSensor());
        System.out.printf("Celsius", t.getTemperatureC());
        //// in this task i found the temperature in Celsius through a Fahrenheit sensor adapter
    }
}