package problemone;

public class Clothing extends Product {

    private String brand;
    private double discountPercentage;

    public Clothing(String productName, double price, String brand, double discountPercentage) {
        super(productName, price);
        this.brand = brand;
        this.discountPercentage = discountPercentage;
    }

    @Override
    public double getPrice() {
        double discountPrice =  (this.discountPercentage/100) * super.getPrice();
        return super.getPrice()-discountPrice;
    }

    @Override
    public String toString() {
        return """
                Product: %s
                Price: %.2f
                Brand: %s
                Discount Percentage: %.2f
                """.formatted(super.getProductName(),this.getPrice(),brand,discountPercentage);
    }
}
