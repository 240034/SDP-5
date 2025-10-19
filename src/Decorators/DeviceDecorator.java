package Decorators;

import Devices.Device;

public abstract class DeviceDecorator implements Device {
    private Device device;

    public DeviceDecorator(Device device) {
        this.device = device;
    }

    @Override
    public void on() {
        device.on();
    }

    public void off() {
        device.off();
    }
}