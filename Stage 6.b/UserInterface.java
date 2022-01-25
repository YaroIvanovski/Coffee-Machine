
package machine;
import java.util.Scanner;
public class UserInterface {
    private final Scanner sc;
    private final CoffeeMachine coffeeMachine;

    public UserInterface(CoffeeMachine coffeeMachine, Scanner sc) {
        this.coffeeMachine = coffeeMachine;
        this.sc = sc;
    }

    public void start() {
        System.out.println("Write action (buy, fill, take, remaining, exit):");
        String action = sc.next();

        while (true) {

            if (action.equals("buy")) {
                coffeeMachine.buy();
            }

            if (action.equals("take")) {
                coffeeMachine.take();
            }

            if (action.equals("fill")) {
                coffeeMachine.fill();
            }

            if (action.equals("remaining")) {
                coffeeMachine.remaining();
            }

            if (action.equals("exit")) {
                break;
            }

            System.out.println();

            System.out.println("Write action (buy, fill, take, remaining, exit): ");
            action = sc.next();
        }
    }
}
