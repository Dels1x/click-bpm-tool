package ua.delsix.clickbpmtool;

public class Timer implements Runnable {

    private static long startTime = 0;
    private static boolean isRunning = false;

    public Timer() {
        start();
    }

    public void start() {
        startTime = System.currentTimeMillis();
        isRunning = true;
        Thread timerThread = new Thread(this);
        timerThread.start();
    }

    public static void stop() {
        isRunning = false;
    }

    public static double getPassedTime() {
        return (System.currentTimeMillis() - startTime) / 1000.0;
    }

    public static boolean isRunning() {
        return isRunning;
    }

    @Override
    public void run() {
    }
}
