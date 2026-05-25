package _04_Encapsulation;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.List;

public class TemperatureSensor {
    private List<Double> readings = new ArrayList<>();

    public void addReading(double value) {
        // Only add if value is between -50 and 150 (inclusive)
        if(value >= -50 && value <= 150){
            readings.add(value);
        }
    }

    public double getAverage() {
        // Return the average of all readings, or 0.0 if no readings exist
        double average = readings.stream()
                .mapToDouble(Double::doubleValue)
                .average()
                .orElse(0.0);

        return BigDecimal.valueOf(average)
                .setScale(2, RoundingMode.HALF_UP)
                .doubleValue();
    }

    public int getReadingCount() {
        return readings.size();
    }

    public List<Double> getReadings() {
        // Return a defensive copy of the readings list (not the original)
        return new ArrayList<>(readings);
    }

    public static void main(String[] args) {
        TemperatureSensor sensor = new TemperatureSensor();
        sensor.addReading(22.5);
        sensor.addReading(23.1);
        sensor.addReading(200.0);  // Should be rejected
        sensor.addReading(-10.0);

        System.out.println("Count: " + sensor.getReadingCount());  // 3
        System.out.println("Average: " + sensor.getAverage());     // 11.87
    }
}
