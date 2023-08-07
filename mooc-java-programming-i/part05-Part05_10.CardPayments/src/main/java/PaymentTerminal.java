
public class PaymentTerminal {


    private double money;  // amount of cash
    private int affordableMeals; // number of sold affordable meals
    private int heartyMeals;  // number of sold hearty meals


    public PaymentTerminal() {
        // register initially has 1000 euros of money
        this.money = 1000;
        this.affordableMeals = 0;
        this.heartyMeals = 0;
    }

    public double eatAffordably(double payment) { // Accepts Cash
        // an affordable meal costs 2.50 euros
        // increase the amount of cash by the price of an affordable mean and return the change
        // if the payment parameter is not large enough, no meal is sold and the method should return the whole payment
        double price = 2.50;
        if (payment < price) return payment;
        affordableMeals++;
        money += price;
        return payment - price;
    }

    public double eatHeartily(double payment) { // Accepts Cash
        // a hearty meal costs 4.30 euros
        // increase the amount of cash by the price of a hearty mean and return the change
        // if the payment parameter is not large enough, no meal is sold and the method should return the whole payment
        double price = 4.30;
        if (payment < price) return payment;
        heartyMeals++;
        money += price;
        return payment - price;
    }

    public boolean eatAffordably(PaymentCard card) { // Accepts payment card
        // an affordable meal costs 2.50 euros
        // increase the amount of cash by the price of an affordable mean and return the change
        // if the payment parameter is not large enough, no meal is sold and the method should return the whole payment
        double price = 2.50;
        if (card.balance() < price) return false;
        card.takeMoney(price);
        affordableMeals++;
        //money += price; // Card payments don't increase register bala
        return true;
    }

    public boolean eatHeartily(PaymentCard card) { // Accepts payment card
        // a hearty meal costs 4.30 euros
        // increase the amount of cash by the price of a hearty mean and return the change
        // if the payment parameter is not large enough, no meal is sold and the method should return the whole payment
        double price = 4.30;
        if (card.balance() < price) return false;
        card.takeMoney(price);
        heartyMeals++;
        //money += price; // Card payments don't increase register balance
        return true;
    }

    public void addMoneyToCard(PaymentCard card, double amount) {
        if (amount >= 0.0) {
            card.addMoney(amount);
            money += amount;
        }
    }


    @Override
    public String toString() {
        return "money: " + money + ", number of sold affordable meals: " + affordableMeals + ", number of sold hearty meals: " + heartyMeals;
    }
}