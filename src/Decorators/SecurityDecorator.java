package Decorators;

import Devices.Light;

public class SecurityDecorator extends DeviceDecorator {
    public SecurityDecorator(Object device) {
        super(device);
    }

    public void on() {
        System.out.println("[Security Check] User verified");
        if (device instanceof Light) {
            ((Light) device).on();
        }
    }

    public void off() {
        System.out.println("[Security Check] User verified");
        if (device instanceof Light) {
            ((Light) device).off();
        }
    }
}
