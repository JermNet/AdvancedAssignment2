public class ProductManager {
    public boolean isAvailable(Product product, int quantity) {
        return product.getAmount() >= quantity;
    }

    public void reduceAmount(Product product, int quantity) {
        if (isAvailable(product, quantity)) {
            product.setAmount(product.getAmount() - quantity);
        }
    }

    public void increaseAmount(Product product, int quantity) {
        product.setAmount(product.getAmount() + quantity);
    }
}
