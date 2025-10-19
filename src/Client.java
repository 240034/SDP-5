import Devices.Light;
import Decorators.LoggingDecorator;
import Decorators.SecurityDecorator;
import Facade.SmartHomeFacade;

public class Client {
    public static void main(String[] args) {

        SmartHomeFacade home = new SmartHomeFacade();
        home.arriveHome();
        home.leaveHome();

        System.out.println("\n--- Using Decorators ---");
        Light lamp = new Light();
        SecurityDecorator secureLamp = new SecurityDecorator(lamp);
        LoggingDecorator loggedSecureLamp = new LoggingDecorator(secureLamp);

        loggedSecureLamp.on();
        loggedSecureLamp.off();
    }
}
