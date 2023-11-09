import java.util.Timer;
import java.util.TimerTask;

public class CronServer {

    public static void main(String[] args) {
        // Schedule a task to run every minute
        scheduleCronTask("0 * * * * ?");
    }

    public static void scheduleCronTask(String cronExpression) {
        Timer timer = new Timer();

        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                // Your task logic goes here
                System.out.println("Cron task executed at: " + System.currentTimeMillis());
            }
        }, 0, 60 * 1000); // 60 seconds interval

        // Uncomment the following line if you want to use a cron expression
        // scheduleCronExpression(timer, cronExpression);
    }

    // Uncomment this method if you want to use a cron expression
    /*
    public static void scheduleCronExpression(Timer timer, String cronExpression) {
        try {
            CronExpression cron = new CronExpression(cronExpression);
            timer.schedule(new TimerTask() {
                @Override
                public void run() {
                    // Your task logic goes here
                    System.out.println("Cron task executed at: " + System.currentTimeMillis());
                }
            }, 0, 1000); // 1-second interval, you can adjust this based on your cron expression

        } catch (ParseException e) {
            e.printStackTrace();
        }
    }
    */
}
