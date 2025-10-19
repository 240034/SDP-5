package Facade;

import Devices.Light;
import Devices.SecuritySystem;
import Devices.Thermostat;

public class SmartHomeFacade {
    private final Light light;
    private final Thermostat thermostat;
    private final SecuritySystem securitySystem;

    public SmartHomeFacade() {
        this.light = new Light();
        this.thermostat = new Thermostat();
        this.securitySystem = new SecuritySystem();
    }

    public void arriveHome() {
        System.out.println("\n--- Arriving Home ---");
        securitySystem.disarm();
        light.on();
        thermostat.setTemperature(22);
    }

    public void leaveHome() {
        System.out.println("\n--- Leaving Home ---");
        light.off();
        thermostat.setTemperature(18);
        securitySystem.arm();
    }
}
