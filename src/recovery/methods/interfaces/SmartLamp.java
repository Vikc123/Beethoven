package recovery.methods.interfaces;

public class SmartLamp extends SmartDevice implements Switchable, Adjustable {
    private boolean on;
    private int brightness;

    public SmartLamp(Boolean on, int brightness, String name, int serialNumber) {
        super(name, serialNumber);
        this.on = on;
        this.brightness = brightness;
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
        this.brightness = level;
    }

    @Override
    public int getLevel() {
        return this.brightness;
    }

}
