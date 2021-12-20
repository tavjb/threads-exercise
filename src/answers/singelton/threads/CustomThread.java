package answers.singelton.threads;

import answers.singelton.logging.Logger;
import answers.singelton.logging.enums.LogLevel;

public class CustomThread extends Thread {
    private final Logger logger = Logger.getInstance();

    @Override
    public void run() {
        logger.log(LogLevel.INFO, "Logging from " + this.getName());
    }
}
