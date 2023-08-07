
public class Money {

    private final int euros;
    private final int cents;

    public Money(int euros, int cents) {

        if (cents > 99) {
            euros = euros + cents / 100;
            cents = cents % 100;
        }

        this.euros = euros;
        this.cents = cents;
    }

    public Money plus(Money addition) {
        return new Money(euros + addition.euros, cents + addition.cents);
    }

    public Money minus(Money decreaser) {
        Money newMoney;
        int totalMoney = (euros * 100 + cents) - (decreaser.euros * 100 + decreaser.cents);
        if (totalMoney <= 0) {
            newMoney = new Money(0, 0);
        } else {
            newMoney = new Money(0, totalMoney); // Constructor will do calculation based on cents
        }
        return newMoney;
    }

    public boolean lessThan(Money compared) {
        if (euros < compared.euros) return true;

        if (euros == compared.euros) {
            return cents < compared.cents;
        }
        return false;
    }

    public int euros() {
        return this.euros;
    }

    public int cents() {
        return this.cents;
    }

    public String toString() {
        String zero = "";
        if (this.cents < 10) {
            zero = "0";
        }

        return this.euros + "." + zero + this.cents + "e";
    }

}