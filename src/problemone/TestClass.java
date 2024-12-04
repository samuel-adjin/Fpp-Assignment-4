package problemone;


public class TestClass {

    public static void main(String[] args) {
        Clothing jacket = new Clothing("Jacket", 452.56, "Dior",2.5);
        Clothing hoodie = new Clothing("Hoodie", 252.56, "Dior",1.5);
        Furniture table = new Furniture("Adjustable Table", 100.23, "Wood", 50.0);
        Electronics laptop = new Electronics("Laptop", 890.60,45.0,11);
        Electronics phone = new Electronics("Phone", 790.60,25.0,5);

        Product[] products = {laptop, phone, table, hoodie, jacket};
        for (Product product : products) {
            System.out.println(product);
        }
        System.out.println("Sum of all products " + sumProducts(products));
    }


    public static double sumProducts(Product[] col) {
        double sum = 0.0;
        if(col == null){
            return sum;
        }
        for (Product product : col) {
            sum += product.getPrice();
        }
        String formattedSum = String.format("%.2f", sum);
        return Double.parseDouble(formattedSum);
    }


}
