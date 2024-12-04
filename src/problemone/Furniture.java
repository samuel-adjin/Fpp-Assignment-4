package problemone;

public class Furniture extends Product {

    private String material;
    private double shippingCost;

    public Furniture(String productName, double price, String material, double shippingCost) {
        super(productName, price);
        this.material = material;
        this.shippingCost = shippingCost;
    }

    @Override
    public double getPrice() {
        return super.getPrice() + shippingCost;
    }

    @Override
    public String toString() {
        return """
                Product: %s
                Price: %.2f
                Material: %s
                Shipping Cost: %.2f
                """.formatted(super.getProductName(),this.getPrice(), material, shippingCost);
    }
}
