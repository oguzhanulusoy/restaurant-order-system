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
        ORDER
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

        if (input.equals(MenuOptions.ORDER.toString())) {

            System.out.print("Please enter table: ");
            String table = input.next();

            ArrayList<Item> items = restaurant.getItems();
            Item orderedItem;

            for (Item item : items) {
                System.out.print("\t\t" + item.getName());
                System.out.println("Choose");
                String choice = input.next();
                if(choice != "") {
                    orderedItem = item;
                    restaurant.order(item, table);
                }
            }
        }




    }

    public static void main(String[] args) {
	// write your code here
        run();
    }
}
