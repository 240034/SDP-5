package Devices;

public class SecuritySystem implements Device {
    public void arm() {
        System.out.println("Security is ARMED");
    }

    public void disarm() {
        System.out.println("Security is DISARMED");
    }

    @Override
    public void on() {}

    @Override
    public void off() {}
}