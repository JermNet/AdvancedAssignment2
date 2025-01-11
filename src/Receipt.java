public class Receipt {
    private Order order;

    public Receipt(Order order) {
        this.order = order;
    }

    public String printReceipt() {
        return "------ Receipt ------\nOrder ID: " + order.getOrderId() +
                "\nProduct: " + order.getProduct().getName() +
                "\nAmount: " + order.getQuantity() +
                "\nTotal Price (CAD) $" + order.getTotal() +
                "\n---------------------";
    }
}
