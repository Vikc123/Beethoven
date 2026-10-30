package recovery.methods.interfaces;

public abstract class SmartDevice {
    private String name;
    private int serialNumber;

    public SmartDevice(String name, int serialNumber) {
        this.name = name;
        this.serialNumber = serialNumber;
    }

    public String getName() {
        return this.name;
    }

    public int getSerialNumber() {
        return this.serialNumber;
    }

    public void printInfo() {
        System.out.println(this.name);
        System.out.println(this.name);
    }
}
