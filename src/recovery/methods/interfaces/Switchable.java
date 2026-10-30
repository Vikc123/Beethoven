package recovery.methods.interfaces;

public interface Switchable {
    public void turnOn();
    public void turnOff();
    public boolean isOn();
    public default void restart() {
        turnOff();
        turnOn();
    };
    public static void printSafetyInfo() {
        System.out.println("Аккуратнее");
    }
}
