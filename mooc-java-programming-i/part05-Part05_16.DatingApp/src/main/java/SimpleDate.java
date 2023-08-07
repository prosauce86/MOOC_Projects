
public class SimpleDate {

    private int day;
    private int month;
    private int year;

    public SimpleDate(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    @Override
    public String toString() {
        return this.day + "." + this.month + "." + this.year;
    }

    // Assumes all months have 30 days
    public void advance() {
        if (day <= 30) {
            if (day == 30) { // 30th day of month, set day 1 and advance 1 month unless it's 12th month
                day = 1;
                if (month < 12) {
                    month++;
                } else {
                    month = 1;
                    year++;
                }
            } else {
                day++;
            }
        }
    }

    public void advance(int howManyDays) {
        for (int i = 0; i < howManyDays; i++) {
            advance();
        }
    }

    public boolean before(SimpleDate compared) {
        if (this.year < compared.year) {
            return true;
        }

        if (this.year == compared.year && this.month < compared.month) {
            return true;
        }

        if (this.year == compared.year && this.month == compared.month &&
                 this.day < compared.day) {
            return true;
        }

        return false;
    }

    public SimpleDate afterNumberOfDays(int days) {
        SimpleDate date = new SimpleDate(day, month, year);
        date.advance(days);
        return date;
    }

}