public class Ticket {
    private Product product;

    public Ticket(Product product) {
        this.product = product;
    }

    public void setReceived(boolean received) {
        product.setReceived(received);
    }

    public boolean getReceived() {
        return product.isReceived();
    }

    public String toString() {
        return product.toString();
    }


}
