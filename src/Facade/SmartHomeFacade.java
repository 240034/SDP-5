package Facade;

import Devices.Light;
import Devices.Thermostat;
import Devices.SecuritySystem;

public class SmartHomeFacade {
    private Light light;
    private Thermostat thermostat;
    private SecuritySystem securitySystem;

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
