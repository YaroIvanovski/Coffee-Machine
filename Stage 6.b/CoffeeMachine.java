
package machine;
import java.util.Scanner;

public class CoffeeMachine {

    private int water;
    private int milk;
    private int beans;
    private int cups;
    private int money;
    static Scanner sc = new Scanner(System.in);

    public CoffeeMachine(int water, int milk, int beans, int cups, int money) {
        this.beans = beans;
        this.money = money;
        this.milk = milk;
        this.water = water;
        this.cups = cups;
    }

    public void buy() {
        System.out.println("What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino, back - to main menu: ");
        String action = sc.next();
        switch (action) {
            case "1":
                espresso();
                break;
            case "2":
                latte();
                break;
            case "3":
                cappuccino();
                break;
            default:
                break;
        }
    }

    public void espresso() {
        if (water >= 250 && beans >= 16 && cups >= 1) {
            water -= 250;
            beans -= 16;
            cups -= 1;
            money += 4;
            System.out.println("I have enough resources, making you a coffee!");
        } else if (water < 250) {
            money -= 4;
            System.out.println("Sorry, not enough water!");
        } else if (beans < 16) {
            money -= 4;
            System.out.println("Sorry, not enough coffee!");
        }
    }

    public void latte() {
        if (water >= 350 && milk >= 75 && beans >= 25 && cups >= 1) {
            water -= 350;
            beans -= 20;
            milk -= 75;
            cups -= 1;
            money += 7;
            System.out.println("I have enough resources, making you a coffee!");
        } else if (water < 350 ) {
            money -= 7;
            System.out.println("Sorry, not enough water!");
        } else if (milk < 75) {
            money -= 7;
            System.out.println("Sorry, not enough milk!");
        } else if (beans < 20) {
            money -= 7;
            System.out.println("Sorry, not enough coffee!");
        }
    }

    public void cappuccino() {
        if (water >= 200 && milk >= 100 && beans >= 12 && cups >= 1) {
            water -= 200;
            beans -= 12;
            milk -= 100;
            cups -= 1;
            money += 6;
            System.out.println("I have enough resources, making you a coffee!");
        } else if (water < 200) {
            money -= 6;
            System.out.println("Sorry, not enough water!");
        } else if (milk < 100) {
            money -= 6;
            System.out.println("Sorry, not enough milk!");
        } else if (beans < 12) {
            money -= 6;
            System.out.println("Sorry, not enough coffee!");
        }
    }

    public  void fill() {
        System.out.println("Write how many ml of water you want to add:");
        water += sc.nextInt();
        System.out.println("Write how many ml of milk you want to add: ");
        milk += sc.nextInt();
        System.out.println("Write how many grams of coffee beans you want to add:");
        beans += sc.nextInt();
        System.out.println("Write how many disposable cups of coffee you want to add:");
        cups += sc.nextInt();
    }

    public void remaining() {
        System.out.println("The coffee machine has:\n" +
                water + " ml of water\n" +
                milk + " ml of milk\n" +
                beans + " g of coffee beans\n" +
                cups + " disposable cups\n" +
                "$" + money + " of money ");
    }

    public void take() {
        System.out.println("I gave you $ " + money);
        money = 0;
    }
}
