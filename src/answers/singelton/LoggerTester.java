package answers.singelton;

import answers.singelton.threads.CustomThread;

public class LoggerTester {
    public static void main(String[] args) {
        Thread t1 = new CustomThread();
        Thread t2 = new CustomThread();

        t1.start();
        t2.start();
    }
}
