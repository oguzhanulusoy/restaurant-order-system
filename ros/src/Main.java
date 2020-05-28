import java.awt.*;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author oppenheimer
 */
public class Main {

    public enum MenuOptions {
        ADD_FOOD,
        ADD_DRINK,
        GET_ITEMS,
        MAKE_ORDER
    }

    public static void run() {

        Restaurant restaurant = new Restaurant();
        Scanner input = new Scanner(System.in);

        if (input.equals(MenuOptions.ADD_FOOD.toString())) {
            System.out.print("Please enter name: ");
            String name = input.next();

            System.out.print("Please enter containings: ");
            String receipt = input.next();

            restaurant.addFood(name, receipt);
        }

        if (input.equals(MenuOptions.ADD_DRINK.toString())) {
            System.out.print("Please enter name: ");
            String name = input.next();

            System.out.print("Please enter type: ");
            String type = input.next();

            restaurant.addDrink(name, type);
        }

        if (input.equals(MenuOptions.GET_ITEMS.toString())) {
            for(Item item : restaurant.getItems()){
                System.out.println(item.getName());
            }

        }

        if (input.equals(MenuOptions.MAKE_ORDER.toString())) {
            System.out.println("Please enter table: ");
            String table = input.next();

            Order order = new Order(table);
            restaurant.orders.add(order);

            System.out.println("Enter your item: ");
            String item = input.next();

            order.addItem(restaurant.findItem(item));
        }

        // TODO: Implement your user-friendly console app
    }

    public static void main(String[] args) {
	// write your code here
        run();
    }
}
