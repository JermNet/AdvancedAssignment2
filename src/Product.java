public class Product {
    private String name;
    private int amount;
    private boolean isReceived;

    // The main SOLID principles I'm trying to abide by are Single responsibility and open closed.
    // The methods are public, and the variables private so this follows those rules
    public Product(String name, int amount) {
        this.name = name;
        this.amount = amount;
        isReceived = false;
    }

    public String getName() {
        return name;
    }

    public int getAmount() {
        return amount;
    }

    public boolean isReceived() {
        return isReceived;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setReceived(boolean isReceived) {
        this.isReceived = isReceived;
    }

    public String toString() {
        return "Name: " + name + " Amount: " + amount + " Received: " + isReceived;
    }
}
