import java.util.List;

public class Main {
    public static void main(String[] args) {
        Product personalComputer = new Product ("PC", 100);
        Product laptop = new Product ("Laptop", 200);
        Product tablet = new Product ("Tablet", 300);
        OrderManager orderManager = new OrderManager();

        // Sample things to test the system, first check the availability


        // Place an order for each, then return one and try to return one that doesn't exist
        System.out.println(orderManager.makeOrder(1, 2, personalComputer));
        System.out.println(orderManager.makeOrder(2, 14, laptop));
        System.out.println(orderManager.makeOrder(3, 10, tablet));

        System.out.println(orderManager.returnOrder(2));
        System.out.println(orderManager.returnOrder(44));

        // Check availability of things we have ordered (Laptop is the same amount since the order has been returned)
        System.out.println(orderManager.checkAvailability(personalComputer));
        System.out.println(orderManager.checkAvailability(laptop));
        System.out.println(orderManager.checkAvailability(tablet));

        // Finally "track" the orders (aka, get the history of orders)
        // Laptop is not here since it's been returned
        List<Order> history = orderManager.getHistoryOfOrders();
        for (Order order : history) {
            System.out.println(order.toString());
        }

    }
}