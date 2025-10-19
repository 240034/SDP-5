package Decorators;

import Devices.Device;

public class SecurityDecorator extends DeviceDecorator {

    public SecurityDecorator(Device device) {
        super(device);
    }

    private boolean verifyUser() {
        System.out.println("[Security Check] User verified");
        return true;
    }

    @Override
    public void on() {
        if (verifyUser()) {
            super.on(); // выполняем действие устройства после проверки
        }
    }

    @Override
    public void off() {
        if (verifyUser()) {
            super.off(); // выполняем действие устройства после проверки
        }
    }
}
