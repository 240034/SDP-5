# Smart Home – Facade and Decorator Patterns (Java)

This project demonstrates two structural design patterns in Java: **Facade** and **Decorator**, using a simple **Smart Home** example.


## 🔧 Design Patterns Used

### ✅ Facade
The **Facade** pattern provides a simplified interface to a complex system.

In this project, the `SmartHomeFacade` class controls multiple home devices:
- `Light`
- `Thermostat`
- `SecuritySystem`

Example:
```java
SmartHomeFacade smartHome = new SmartHomeFacade();
smartHome.arriveHome();  // Turn on lights, disarm security, set temperature
smartHome.leaveHome();   // Turn off lights, arm security
```
### Decorator

The Decorator pattern allows adding new behavior to objects dynamically without modifying their original code.

Decorators implemented:

LoggingDecorator – adds logging

SecurityDecorator – adds security verification

Example:
```java
Light lamp = new Light();
SecurityDecorator secureLamp = new SecurityDecorator(lamp);
LoggingDecorator loggedSecureLamp = new LoggingDecorator(secureLamp);

loggedSecureLamp.on();
loggedSecureLamp.off();
```

### Project Structure
src/
 ├── Devices/
 
 │     ├── Light.java
 
 │     ├── Thermostat.java
 
 │     ├── SecuritySystem.java
 
 ├── Decorators/
 
 │     ├── DeviceDecorator.java
 
 │     ├── LoggingDecorator.java
 
 │     ├── SecurityDecorator.java
 
 ├── Facade/
 
 │     ├── SmartHomeFacade.java
 
 ├── Main.java

### Program Output
--- Arriving Home ---
Security is DISARMED
Light on
Temperature set to 22°C

--- Leaving Home ---
Light off
Temperature set to 18°C
Security is ARMED

--- Using Decorators ---
[Log] Turning ON device
[Security Check] User verified
Light on
[Log] Turning OFF device
[Security Check] User verified
Light off

### Purpose
This project is for educational purposes and demonstrates how structural design patterns can improve flexibility, readability, and modularity in object-oriented programming using Java.
