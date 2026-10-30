package recovery.methods.interfaces;

public class SmartFan extends SmartDevice implements Switchable, Adjustable {
    private boolean on;
    private int speed;

    public SmartFan(boolean on, int speed, String name, int serialNumber) {
        super(name, serialNumber);
        this.on = on;
        this.speed = speed;
    }

    @Override
    public void turnOn() {
        this.on = true;
    }

    @Override
    public void turnOff() {
        this.on = false;
    }

    @Override
    public boolean isOn() {
        return this.on;
    }

    @Override
    public void setLevel(int level) {
        this.speed = level;
    }

    @Override
    public int getLevel() {
        return this.speed;
    }
}
