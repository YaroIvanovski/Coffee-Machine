
package machine;
import java.util.Scanner;
public class CoffeeMachine {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Write how many ml of water the coffee machine has: ");
        int water = scanner.nextInt();
        System.out.println("Write how many ml of milk the coffee machine has:");
        int milk = scanner.nextInt();
        System.out.println("Write how many grams of coffee beans the coffee machine has:");
        int beans = scanner.nextInt();
        System.out.println("Write how many cups of coffee you will need:");
        int cups = scanner.nextInt();

        int minW = water / 200;
        int minM = milk / 50;
        int minB = beans / 15;

        int minRes = Math.min(Math.min(minW, minM), minB);

        if (minRes == cups) {
            System.out.println("Yes, I can make that amount of coffee");
        } else if (minRes < cups) {
            System.out.println("No, I can make only " + minRes + " cup(s) of coffee");
        } else if (minRes > cups) {
            int more = minRes - cups;
            System.out.println("Yes, I can make that amount of coffee (and even " + more + " more than that)");
        }
    }
}
