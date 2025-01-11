public class OrderShipment {
    public String processShipment(Ticket ticket) {
        if (ticket.getReceived()) {
            return "Your shipment for " + ticket.toString() + " is being processed!";
        }
        return "Your shipment for " + ticket.toString() + " is NOT being processed, the cargo dealer is has not received the ticket.";
    }
}
