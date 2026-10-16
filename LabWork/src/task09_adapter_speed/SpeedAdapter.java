package task09_adapter_speed;

public class SpeedAdapter implements MetricSpeedometer {
    private final ImperialSpeedometer imperial;

    public SpeedAdapter(ImperialSpeedometer imperial) {
        this.imperial = imperial;
    }

    public double getSpeedKm() {
        return imperial.getSpeedMph() * 1.60934;
    }
}