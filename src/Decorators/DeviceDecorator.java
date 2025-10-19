package Decorators;

public abstract class DeviceDecorator {
    protected Object device;

    public DeviceDecorator(Object device) {
        this.device = device;
    }
}
