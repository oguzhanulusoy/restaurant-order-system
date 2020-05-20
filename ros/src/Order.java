/**
 * @author oppenheimer
 */

import java.util.ArrayList;
import java.util.Date;

public class Order {


    private static final int SECOND = 1000;
    private static final int MINUTE = SECOND * 60;
    static final int HOUR = MINUTE * 60;

    private ArrayList<Item> items;

    private int id = 0, duration;
    private Long start, end;
    private boolean isCompleted;
    private Date date;
    private String table;

    public Order(String table) {
        id++;

        items = new ArrayList<Item>();

        date = new Date();
        this.setStart(date.getTime());

        this.setCompleted(false);

        this.setTable(table);
    }

    public void addItem(Item item) {
        items.add(item);
    }

    public void cancelItem(Item item) {
        items.remove(item);
    }

    public void complete() {
        this.setCompleted(true);
        this.setEnd(date.getTime());
        this.setDuration((int) ((this.getEnd() - this.getStart()) % HOUR / MINUTE));
    }

    public double getTotalPrice() {
        double total = 0;

        for (Item item : this.getItems()) {
            total += item.getPrice();
        }

        return total;
    }

    public void getOrder() {
        // TODO: To be implemented
    }

    public ArrayList<Item> getItems() {
        return items;
    }

    public void setItems(ArrayList<Item> items) {
        this.items = items;
    }

    public Long getStart() {
        return start;
    }

    public void setStart(Long start) {
        this.start = start;
    }

    public Long getEnd() {
        return end;
    }

    public void setEnd(Long end) {
        this.end = end;
    }

    public String getTable() {
        return table;
    }

    public void setTable(String table) {
        this.table = table;
    }

    public boolean isCompleted() {
        return isCompleted;
    }

    public void setCompleted(boolean completed) {
        isCompleted = completed;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }
}
