public class CargoDealer {
    public String processTicket(Ticket ticket) {
        ticket.setReceived(true);
        return "Received ticket for this " + ticket.toString() + " product.";
    }
}
