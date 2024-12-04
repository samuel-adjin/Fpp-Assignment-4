package problemone;

import java.time.Month;

public class Electronics extends Product{

    private double  warrantyCost;
    private int warranty;

    public Electronics(String productName, double price, double warrantyCost, int warranty) {
        super(productName, price);
        this.warrantyCost = warrantyCost;
        this.warranty = warranty;
    }

    @Override
    public double getPrice() {
        return super.getPrice() + this.warrantyCost;
    }

    @Override
    public String toString() {
        return """
                Product: %s
                Price: %.2f
                Warranty: %s month(s)
                Warranty Cost: %.2f
                """.formatted(super.getProductName(),this.getPrice(),warranty,warrantyCost);

    }
}
