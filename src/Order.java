public class Order {
    private int orderId;
    private int quantity;
    private Product product;

    public Order(int orderId, int quantity, Product product) {
        this.orderId = orderId;
        this.quantity = quantity;
        this.product = product;
    }

    public int getOrderId() {
        return orderId;
    }

    public int getQuantity() {
        return quantity;
    }

    public Product getProduct() {
        return product;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    // This is just multiplied by 200 since this is an example and not "real" code
    public double getTotal() {
        return quantity * 200;
    }

    public String toString() {
        return orderId + "\t" + quantity + "\t" + product + "\t" + getTotal();
    }
}
