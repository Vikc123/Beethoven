package recovery;

import recovery.methods.interfaces.Switchable;
import recovery.methods.interfaces.Adjustable;
import recovery.methods.interfaces.SmartDevice;
import recovery.methods.interfaces.SmartKettle;
import recovery.methods.interfaces.SmartLamp;
import recovery.methods.interfaces.SmartFan;


public class Main {
    public static void main(String[] args) {
        SmartDevice n_1 = new SmartLamp("Лампа в спальне", 1001);
        SmartDevice n_2 = new SmartFan("Вентилятор в кухне", 1002);
        SmartDevice n_3 = new SmartKettle("Чайние на кухне", 1003);

        Switchable[] devices = new Switchable[3];
        Adjustable[] devices_1 = new Adjustable[2];

        devices[0] = (Switchable) n_1;
        devices[1] = (Switchable) n_2;
        devices[2] = (Switchable) n_3;
        devices_1[0] = (Adjustable) n_2;
        devices_1[1] = (Adjustable) n_1;

        for (int i = 0; i < 3; i++) {
            devices[i].turnOn();
            devices[i].isOn();
            devices[i].restart();
            devices[i].turnOff();
        }

        for (int i = 0; i < 2; i++) {
            devices_1[i].setLevel(75);
            System.out.println(devices_1[i].getLevel());
        }

    }
}