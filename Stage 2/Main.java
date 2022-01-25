

package machine;
import java.util.Scanner;
public class CoffeeMachine {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();

        int water = 200;
        int milk = 50;
        int beans = 15;

        System.out.println("For " + input + " cups of coffee you will need:\n" +
                input * water + " ml of water\n" +
                input * milk + " ml of milk\n" +
                input * beans + " g of coffee beans");

    }
}
