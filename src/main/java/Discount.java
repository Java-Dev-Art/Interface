import java.util.Scanner;

public class Discount extends Purchases{
    private Euro discountPrice;

    public Discount() {
        super();
    }

    public Discount(String productName, Euro price, int numberOfPurchase, Euro discountPrice) {
        super(productName, price, numberOfPurchase);
        this.discountPrice = discountPrice;
    }

    public Discount(Scanner scanner, Euro discountPrice) {
        super(scanner);
        this.discountPrice = discountPrice;
    }

    @Override
    public Euro getCost() {
        return new Euro(super.getCost().getCents() - discountPrice.getCents());
    }
}
