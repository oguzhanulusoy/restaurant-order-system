/**
 * @author oppenheimer
 */
public class Food extends Item {

    private String receipt;

    public Food(String name, String receipt) {
        super(name);
        this.receipt = receipt;
    }

    public String getReceipt() {
        return receipt;
    }

    public void setReceipt(String receipt) {
        this.receipt = receipt;
    }
}
