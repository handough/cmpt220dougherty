import java.util.Timer;
import java.util.TimerTask;

public class MyTimer {
    private int totalRunningTime;
    private int currentTime = 0;
    private int intervalTime;

    private Timer timer = new Timer();

    public MyTimer(int totalRunningTime, int intervalTime) {
        this.totalRunningTime = totalRunningTime;
        this.intervalTime = intervalTime;
    }
    public void startTimer() {
        startTimer(intervalTime);
    }

    private void startTimer(int time) {
        timer.schedule(new TimerTask() {
            public void run() {

                if (currentTime <= totalRunningTime - intervalTime) {
                    printTimeSinceLast(intervalTime / 1000);
                    currentTime += intervalTime;
                    startTimer(intervalTime);
                } else if (currentTime < totalRunningTime) {
                    int newRestIntervalTime = totalRunningTime - currentTime;
                    printTimeSinceLast(newRestIntervalTime / 1000);
                    currentTime += newRestIntervalTime;
                    startTimer(newRestIntervalTime);
                }
            }
        }, time);
    }

    private void printTimeSinceLast(int timeSinceLast) {
        System.out.println("Do exercise " + timeSinceLast + " seconds later.");
    }
}


