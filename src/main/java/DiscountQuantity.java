import java.util.Scanner;

public class DiscountQuantity extends Purchases{
    private int number;
    private double discountRate;
    private static final int MIN_NUMBER = 10;

    public DiscountQuantity(int number, double discountRate) {
        this.number = number;
        this.discountRate = discountRate;
    }

    public DiscountQuantity(String productName, Euro price, int numberOfPurchase, int number, double discountRate) {
        super(productName, price, numberOfPurchase);
        this.number = number;
        this.discountRate = discountRate;
    }

    public DiscountQuantity(Scanner scanner, int number, double discountRate) {
        super(scanner);
        this.number = number;
        this.discountRate = discountRate;
    }

    @Override
    public Euro getCost() {
        if (number > MIN_NUMBER){
            return new Euro(super.getCost().getCents() - (super.getCost().getCents() * discountRate));
        }else {
            return super.getCost();
        }
    }
}
