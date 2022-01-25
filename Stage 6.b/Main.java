
package machine;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        CoffeeMachine coffeeMachine = new CoffeeMachine(400, 540, 120, 9, 550);

        UserInterface ui = new UserInterface(coffeeMachine, sc);
        ui.start();
    }
}
