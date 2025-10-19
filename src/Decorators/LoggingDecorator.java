package Decorators;

public class LoggingDecorator extends DeviceDecorator {
    public LoggingDecorator(Object device) {
        super(device);
    }

    public void on() {
        System.out.println("[Log] Turning ON device");
        try {
            device.getClass().getMethod("on").invoke(device);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void off() {
        System.out.println("[Log] Turning OFF device");
        try {
            device.getClass().getMethod("off").invoke(device);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
