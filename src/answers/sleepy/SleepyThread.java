package answers.sleepy;

public class SleepyThread extends Thread {

    public SleepyThread(int rate) {
        this.rate = rate;
    }

    private final int rate;

    public void run() {
        System.out.println("" +
                "-- Running a new sleepy thread (" +
                "name: " + this.getName()
                + ", rate: " + this.rate / 1000 + " seconds"
                + ") --"
        );
        while (true) {
            try {
                sleep(rate);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            System.out.println(this.getName() + ": I'm awake!");
        }
    }
}
