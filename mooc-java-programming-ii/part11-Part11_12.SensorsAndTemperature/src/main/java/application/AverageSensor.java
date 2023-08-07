package application;

import java.util.ArrayList;
import java.util.List;

public class AverageSensor implements Sensor{

    private ArrayList<Sensor> sensors;
    private List<Integer> readings;
    public AverageSensor() {
        this.sensors = new ArrayList<>();
        this.readings = new ArrayList<>();
    }

    public void addSensor(Sensor toAdd) {
        sensors.add(toAdd);
    }

    public List<Integer> readings() {
        return readings;
    }

    @Override
    public boolean isOn() {
        for (Sensor s : sensors) {
            if (!s.isOn()) {
                return false;
            }
        }
        return true;
    }

    @Override
    public void setOn() {
        sensors.forEach(Sensor::setOn);
    }

    @Override
    public void setOff() {
        sensors.forEach(Sensor::setOff);
    }

    @Override
    public int read() {
        if (sensors.size() == 0) {
            throw new IllegalStateException("No sensors have been added");
        }

        for (Sensor s : sensors) {
            if (!s.isOn()) {
                throw new IllegalStateException("Not all sensors are on");
            }
        }

        double average = sensors.stream()
                .mapToInt(Sensor::read)
                .average()
                .getAsDouble();

        readings.add((int) average);
        return (int) average;
    }
}