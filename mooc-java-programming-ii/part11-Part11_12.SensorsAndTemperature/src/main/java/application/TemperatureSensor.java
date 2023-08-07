package application;

import java.util.Random;

public class TemperatureSensor implements Sensor {

    private boolean sensorStatus;
    public TemperatureSensor() {
        this.sensorStatus = false;
    }

    @Override
    public boolean isOn() {
        return sensorStatus;
    }

    @Override
    public void setOn() {
        sensorStatus = true;
    }

    @Override
    public void setOff() {
        sensorStatus = false;
    }

    @Override
    public int read() {
        if (!this.sensorStatus) {
            throw new IllegalStateException("Ensure sensor is on first");
        }
        Random random = new Random();
        return random.nextInt(61) - 30;
    }
}