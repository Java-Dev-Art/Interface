import java.util.Objects;
import java.util.Scanner;

public class Purchases {
    private String productName;
    private Euro price;
    private int numberOfPurchase;

    public Purchases() {
    }

    public Purchases(String productName, Euro price, int numberOfPurchase) {
        this.productName = productName;
        this.price = price;
        this.numberOfPurchase = numberOfPurchase;
    }

    public Purchases(Scanner scanner) {
        this(scanner.nextLine(),new Euro(scanner.nextDouble()) ,scanner.nextInt());
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public Euro getPrice() {
        return price;
    }

    public void setPrice(Euro price) {
        this.price = price;
    }

    public int getNumberOfPurchase() {
        return numberOfPurchase;
    }

    public void setNumberOfPurchase(int numberOfPurchase) {
        this.numberOfPurchase = numberOfPurchase;
    }
    public Euro getCost(){
        return new Euro(numberOfPurchase * price.getCents());
    }

    @Override
    public String toString() {
        return "Superclass" +
                 ";" + productName +
                ";" + price +
                ";" + numberOfPurchase + " .";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Purchases)) return false;
        Purchases that = (Purchases) o;
        return numberOfPurchase == that.numberOfPurchase && Objects.equals(productName, that.productName) && Objects.equals(price, that.price);
    }

    @Override
    public int hashCode() {
        return Objects.hash(productName, price, numberOfPurchase);
    }
}
