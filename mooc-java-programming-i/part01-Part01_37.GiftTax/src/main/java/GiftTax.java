
import java.util.Scanner;

public class GiftTax {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Value of the gift?");
        int priceOfGift = Integer.valueOf(scan.nextLine());
        if (priceOfGift <= 4999) {
            System.out.println("No tax");
        } else if (priceOfGift <= 25_000) {
            calculateTax(priceOfGift, 5_000, 100, .08);
        } else if (priceOfGift <= 55_000) {
            calculateTax(priceOfGift, 25_000, 1_700, .10);
        } else if (priceOfGift <= 200_000) {
            calculateTax(priceOfGift, 55_000, 4_700, .12);
        } else if (priceOfGift <= 1_000_000) {
            calculateTax(priceOfGift, 200_000, 22_100, .15);
        } else {
            calculateTax(priceOfGift, 1_000_000, 142_100, .17);
        }

    }

    public static void calculateTax(int price, int value, int lowerLimit, double taxRate) {
        double tax = (lowerLimit + (price - value) * taxRate);
        System.out.println("Tax: " + tax);
    }
}
