package recovery.methods.interfaces;

public class SmartKettle extends SmartDevice implements Switchable{
    private boolean on;

    public SmartKettle(String name, int serialNumber) {
        super(name, serialNumber);
    }

    public SmartKettle(Boolean on) {
        this.on = on;
    }

    public SmartKettle(String name, int serialNumber, Boolean on) {
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
