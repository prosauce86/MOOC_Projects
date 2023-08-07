
public class Main {

    public static void main(String[] args) {
        // test your program here!
        SimpleDate date = new SimpleDate(13, 2, 2015);
        System.out.println("Friday of the examined week is " + date);

        SimpleDate newDate = date.afterNumberOfDays(7);
        int week = 1;
        while (week <= 7) {
            System.out.println("Friday after " + week + " week is " + newDate);
            newDate = newDate.afterNumberOfDays(7);
            week++;
        }

        System.out.println("The date after 415 days from the examined Friday is:");
        date.advance(415);
        System.out.println("Date: " + date);

    }
}