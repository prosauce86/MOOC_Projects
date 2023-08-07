package application;

public class StandardSensor implements Sensor {

    private final int sensorValue;
    private boolean sensorStatus;

    public StandardSensor(int sensorValue) {
        this.sensorValue = sensorValue;
        this.sensorStatus = true;
    }

    @Override
    public boolean isOn() {
        return sensorStatus;
    }

    @Override
    public void setOn() {
        //sensorStatus = true;
    }

    @Override
    public void setOff() {
        //sensorStatus = false;
    }

    @Override
    public int read() {
        if (!sensorStatus) throw new IllegalStateException();
        return this.sensorValue;
    }
}