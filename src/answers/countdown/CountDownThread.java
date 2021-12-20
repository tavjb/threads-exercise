package answers.countdown;

public class CountDownThread extends Thread {
    public CountDownThread(int rate, int counterStartingPoint) {
        this.rate = rate;
        this.counter = counterStartingPoint;
    }

    private final int rate;
    private int counter;

    @Override
    public void run() {
        System.out.println("" +
            "-- Running a new count down thread (" +
                "name: " + this.getName()
                + ", rate: " + this.rate / 1000 + " seconds"
                + ", counterStartingPoint: " + this.counter
            + ") --"
        );
        while (counter > 0) {
            System.out.println(this.getName() + ": " + counter);

            try {
                sleep(rate);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            counter--;
        }
    }
}
