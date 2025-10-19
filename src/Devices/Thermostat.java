package Devices;

public class Thermostat implements Device {
    public void setTemperature(int temperature) {
        System.out.println("Temperature set to " + temperature);
    }

    @Override
    public void on() {}

    @Override
    public void off() {}
}