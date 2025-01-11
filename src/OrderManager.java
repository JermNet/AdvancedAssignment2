import java.util.ArrayList;
import java.util.List;

public class OrderManager {
    private ProductManager productManager;
    private CargoDealer cargoDealer;
    private OrderShipment orderShipment;
    private List<Order> historyOfOrders;

    public OrderManager() {
        productManager = new ProductManager();
        cargoDealer = new CargoDealer();
        orderShipment = new OrderShipment();
        historyOfOrders = new ArrayList<>();
    }

    public String makeOrder(int orderId, int quantity, Product product) {
        if (productManager.isAvailable(product, quantity)) {
            Order order = new Order(orderId, quantity, product);
            productManager.reduceAmount(product, quantity);
            historyOfOrders.add(order);
            Ticket ticket = new Ticket(product);
            cargoDealer.processTicket(ticket);
            orderShipment.processShipment(ticket);
            return generateReceipt(order);
        }
        return "Order failed";
    }

    public String generateReceipt(Order order) {
        Receipt receipt = new Receipt(order);
        return receipt.printReceipt();
    }

    public String returnOrder(int orderId) {
        Order orderToReturn = findOrderById(orderId);
        if (orderToReturn != null) {
            Product product = orderToReturn.getProduct();
            productManager.increaseAmount(product, orderToReturn.getQuantity());
            historyOfOrders.remove(orderToReturn);
            return "Order with the ID " + orderId + " has been returned.";
        }
        return "Order not found.";
    }

    public Order findOrderById(int orderId) {
        for(Order order : historyOfOrders) {
            if (order.getOrderId() == orderId) {
                return order;
            }
        }
        return null;
    }

    public String checkAvailability(Product product) {
        if (product.getAmount() > 0) {
            return "There is " + product.getAmount() + " left of that product!";
        }
        return "That product is out of stock.";
    }

    public List<Order> getHistoryOfOrders() {
        return historyOfOrders;
    }
}
