
package machine;
import java.util.Scanner;
public class CoffeeMachine {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int water = 400;
        int milk = 540;
        int beans = 120;
        int cups = 9;
        int money = 550;
        System.out.println("The coffee machine has:\n" + "400 ml of water\n" + "540 ml of milk\n" +
                "120 g of coffee beans\n" + "9 disposable cups\n" + "$550 of money\n" +
                "\n" + "Write action (buy, fill, take): ");
        String word = scanner.nextLine();
        switch (word) {
            case "buy":
                System.out.println("What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino: ");
                int buy = scanner.nextInt();
                switch (buy) {
                    case 1:
                        System.out.println("The coffee machine has:\n" + (water - 250) +
                                " ml of water\n" +
                                "540 ml of milk\n" + (beans - 16) +
                                " g of coffee beans\n" + (cups - 1) +
                                " disposable cups\n" + (money + 4) +
                                " of money");
                        break;
                    case 2:
                        System.out.println("The coffee machine has:\n" + (water - 350) +
                                " ml of water\n" + (milk - 75) +
                                " ml of milk\n" + (beans - 20) +
                                " g of coffee beans\n" + (cups - 1) +
                                " disposable cups\n" + (money + 7) +
                                " of money");
                        break;
                    case 3:
                        System.out.println("The coffee machine has:\n" + (water - 200) +
                                " ml of water\n" + (milk - 100) +
                                " ml of milk\n" + (beans - 12) +
                                " g of coffee beans\n" + (cups - 1) +
                                " disposable cups\n" + (money + 6) +
                                " of money");
                        break;
                }
                break;

            case "fill":
                System.out.println("Write how many ml of water you want to add:");
                int waterAdd = scanner.nextInt();
                System.out.println("Write how many ml of milk you want to add: ");
                int milkAdd = scanner.nextInt();
                System.out.println("Write how many grams of coffee beans you want to add:");
                int beansAdd = scanner.nextInt();
                System.out.println("Write how many disposable cups of coffee you want to add:");
                int cupsAdd = scanner.nextInt();

                System.out.println("The coffee machine has:\n" + (water + waterAdd)
                       + " ml of water\n" + (milk + milkAdd) +
                        " ml of milk\n" + (beans + beansAdd) +
                        " g of coffee beans\n" + (cups + cupsAdd) +
                        " disposable cups\n" +
                        "$550 of money");
                break;
            case "take":
                System.out.println("I gave you $550\n" +
                        "\n" +
                        "The coffee machine has:\n" +
                        "400 ml of water\n" +
                        "540 ml of milk\n" +
                        "120 g of coffee beans\n" +
                        "9 disposable cups\n" +
                        "$0 of money");
                break;
            default:
                System.out.println("");
                break;
        }
    }
}

