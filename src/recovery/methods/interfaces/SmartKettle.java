package recovery.methods.interfaces;

public class SmartKettle extends SmartDevice implements Switchable{
    private boolean on;

    public SmartKettle(Boolean on, int brightness, String name, int serialNumber) {
        super(name, serialNumber);
        this.on = on;
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
}
