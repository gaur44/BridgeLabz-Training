package performance;

public class TaskRunner {

    public String longRunningTask() {
        try {
            Thread.sleep(3000); // sleeps for 3 seconds
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return "Task completed";
    }

    public String quickTask() {
        try {
            Thread.sleep(1000); // sleeps for 1 second
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return "Task completed";
    }
}