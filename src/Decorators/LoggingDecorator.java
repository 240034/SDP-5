package Decorators;

import Devices.Device;

public class LoggingDecorator extends DeviceDecorator {

    public LoggingDecorator(Device device) {
        super(device);
    }

    @Override
    public void on() {
        System.out.println("[Log] Turning ON device");
        super.on();
    }

    @Override
    public void off() {
        System.out.println("[Log] Turning OFF device");
        super.off();
    }
}
