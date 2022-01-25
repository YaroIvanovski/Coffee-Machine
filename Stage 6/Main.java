
package machine;
import java.util.Scanner;
public class CoffeeMachine {

    static int water = 400;
    static int milk = 540;
    static int beans = 120;
    static int cups = 9;
    static int money = 550;

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Write action (buy, fill, take, remaining, exit):");
        String action = sc.next();

        while (true) {

            if (action.equals("buy")) {
                buy();
            }

            if (action.equals("take")) {
                take();
            }

            if (action.equals("fill")) {
                fill();
            }

            if (action.equals("remaining")) {
                remaining();
            }

            if (action.equals("exit")) {
                break;
            }

            System.out.println();

            System.out.println("Write action (buy, fill, take, remaining, exit): ");
            action = sc.next();
        }
    }

    public static void buy() {

        System.out.println("What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino, back - to main menu: ");
        String num = sc.next();
        int newWater = 0;
        int newBeans = 0;
        int newMoney = 0;
        int newMilk = 0;
        int newCups = 1;
        switch (num) {
            case "1":
                newWater += 250;
                newBeans += 16;
                money += 4;
                if (water >= newWater && beans >= newBeans && cups >= newCups) {
                    water -= newWater;
                    beans -= newBeans;
                    cups -= newCups;
                    money += newMoney;
                    System.out.println("I have enough resources, making you a coffee!");
                } else if (water < newWater) {
                    money -= 4;
                    System.out.println("Sorry, not enough water!");
                } else if (beans < newBeans) {
                    money -= 4;
                    System.out.println("Sorry, not enough coffee!");
                }
                break;

            case "2":
                newWater += 350;
                newMilk += 75;
                newBeans += 20;
                money += 7;
                if (water >= newWater && milk >= newMilk && beans >= newBeans && cups >= newCups) {
                    water -= newWater;
                    beans -= newBeans;
                    milk -= newMilk;
                    cups -= newCups;
                    money += newMoney;
                    System.out.println("I have enough resources, making you a coffee!");
                } else if (water < newWater ) {
                    money -= 7;
                    System.out.println("Sorry, not enough water!");
                } else if (milk < newMilk) {
                    money -= 7;
                    System.out.println("Sorry, not enough milk!");
                } else if (beans < newBeans) {
                    money -= 7;
                    System.out.println("Sorry, not enough coffee!");
                }
                break;
            case "3":
                newWater += 200;
                newMilk += 100;
                newBeans += 12;
                money += 6;
                if (water >= newWater && milk >= newMilk && beans >= newBeans && cups >= newCups) {
                    water -= newWater;
                    beans -= newBeans;
                    milk -= newMilk;
                    cups -= newCups;
                    money += newMoney;
                    System.out.println("I have enough resources, making you a coffee!");
                } else if (water < newWater) {
                    money -= 6;
                    System.out.println("Sorry, not enough water!");
                } else if (milk < newMilk) {
                    money -= 6;
                    System.out.println("Sorry, not enough milk!");
                } else if (beans < newBeans) {
                    money -= 6;
                    System.out.println("Sorry, not enough coffee!");
                }
                break;
                default:
                break;
        }
    }

    public static void fill() {
        System.out.println("Write how many ml of water you want to add:");
        int waterAdd = sc.nextInt();
        System.out.println("Write how many ml of milk you want to add: ");
        int milkAdd = sc.nextInt();
        System.out.println("Write how many grams of coffee beans you want to add:");
        int coffeeAdd = sc.nextInt();
        System.out.println("Write how many disposable cups of coffee you want to add:");
        int cupsAdd = sc.nextInt();
        water += waterAdd;
        milk += milkAdd;
        beans += coffeeAdd;
        cups += cupsAdd;

    }

    public static void remaining() {
        System.out.println("The coffee machine has:\n" +
                water + " ml of water\n" +
                milk + " ml of milk\n" +
                beans + " g of coffee beans\n" +
                cups + " disposable cups\n" +
                "$" + money + " of money ");
    }

    public static void take() {
        System.out.println("I gave you $ " + money);
        money = 0;
    }
}