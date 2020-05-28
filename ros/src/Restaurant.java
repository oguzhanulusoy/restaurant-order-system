/**
 * @author oppenheimer
 */

import java.util.ArrayList;

public class Restaurant {

    public ArrayList<Order> orders;
    private ArrayList<Item> items;

    public Restaurant() {
        items = new ArrayList<Item>();
        orders = new ArrayList<Order>();
    }

    public void addFood(String name, String receipt) {
        Food food = new Food(name, receipt);
        items.add(food);
    }

    public void addDrink(String name, String type) {
        Drink drink = new Drink(name, type);
        items.add(drink);
    }

    public Item findItem(String name) {
        for(Item item : items) {
            if (item.getName().equals(name)) {
                return item;
            }
        }
        return null;
    }

    public void makeOrder(Item item, String table) {
        try {
            Order order = new Order(table);
            order.addItem(item);
            orders.add(order);
        }
        catch (Exception ex) {
            System.out.println();
        }
    }

    public void completeOrder() {
        for (Order order : orders) {
            order.complete();
        }
    }

    public void cancelOrder(Order order, Item item) {
        for (Order index: orders) {
            if (index.equals(order)) {
                index.cancelItem(item);
            }
        }
    }

    public void getBill() {
        double total = 0;
        for (Order order : orders) {
            total += order.getTotalPrice();
        }
    }

    public void change(Order order, Item oldItem, Item newItem) {
        try {
            for (Order index : orders) {
                if (index.equals(orders)) {
                    order.cancelItem(oldItem);
                    order.addItem(newItem);
                }
            }
        }
        catch (Exception ex) {
            System.out.println();
        }
    }

    public ArrayList<Item> getItems() {
        return items;
    }



}
