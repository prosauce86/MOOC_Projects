public class Timer {
    private ClockHand hundredthsOfSecond;
    private ClockHand seconds;

    public Timer() {
        this.hundredthsOfSecond = new ClockHand(100);
        this.seconds = new ClockHand(60);
    }
    public void advance(){
        hundredthsOfSecond.advance();
        if (hundredthsOfSecond.value() ==0) {
            seconds.advance();
        }
    }
    public String toString() {
        return seconds + ":" + hundredthsOfSecond;
    }
}