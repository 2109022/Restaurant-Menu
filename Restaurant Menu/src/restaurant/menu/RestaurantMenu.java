
package restaurant.menu;
import java.util.ArrayList;
import java.util.Scanner;

public class RestaurantMenu {
    private ArrayList<String> items = new ArrayList<>();
    private ArrayList<Double> prices = new ArrayList<>();
    private double totalPrice = 0.0;

    public void addItem(String item, double price) {
        items.add(item);
        prices.add(price);
        System.out.println(item + " added to menu for ksh" + price);
    }

    public void listMenu() {
        System.out.println("Menu:");
        for (int i = 0; i < items.size(); i++) {
            System.out.println((i + 1) + ". " + items.get(i) + " - ksh" + prices.get(i));
        }
    }

    public void orderFood() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("What food would you like to order? (Enter menu number)");
        int choice = scanner.nextInt();
        if (choice < 1 || choice > items.size()) {
            System.out.println("Invalid choice");
            return;
        }
        System.out.println("You ordered " + items.get(choice - 1) + " for ksh" + prices.get(choice - 1));
        totalPrice += prices.get(choice - 1);
    }

    public void orderDrink() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("What drink would you like to order? (Enter menu number)");
        int choice = scanner.nextInt();
        if (choice < 1 || choice > items.size()) {
            System.out.println("Invalid choice");
            return;
        }
        System.out.println("You ordered " + items.get(choice - 1) + " for ksh" + prices.get(choice - 1));
        totalPrice += prices.get(choice - 1);
    }

    public void displayTotal() {
        System.out.println("Your total bill is ksh" + totalPrice);
    }

    public void payViaMobileMoney() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your mobileMoneyNumber:");
        String mobileMoneyNumber = scanner.nextLine();
        System.out.println("Please enter the amount to pay:");
        double amount = scanner.nextDouble();
        System.out.println("Payment of ksh" + amount + " successfully made to " + mobileMoneyNumber);
        totalPrice = 0.0;
    }

    public static void main(String[] args) {
        RestaurantMenu menu = new RestaurantMenu();

        // Add items to menu
        menu.addItem("Rice", 100.0);
        menu.addItem("Chicken", 160.0);
        menu.addItem("Ugali", 120.0);
        menu.addItem("Salad", 200.0);
        menu.addItem("beef stew",150.0);
         menu.addItem("coke", 100.0);
        menu.addItem("tea", 50.0);
        menu.addItem("icecream", 120.0);
        menu.addItem("cocktail", 200.0);
        menu.addItem("water",70.0);
        
        

        // Display menu
        menu.listMenu();

        // Order food and drink
        menu.orderFood();
        menu.orderDrink();

        // Display total bill
        menu.displayTotal();

        // Pay via mobile money
        menu.payViaMobileMoney();
}

}