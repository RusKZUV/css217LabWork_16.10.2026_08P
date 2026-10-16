package task09_adapter_speed;

public class Task09 {
    public static void main(String[] args) {
        MetricSpeedometer m = new SpeedAdapter(new ImperialSpeedometer());
        System.out.printf("Speed: ", m.getSpeedKm());

        // in this task i found speed in km/h through an imperial speedometer adapter
    }
}