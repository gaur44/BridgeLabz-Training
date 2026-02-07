public class BackgroundJob {
    public static void main(String[] args) {

        Runnable job = () -> {
            System.out.println("Background job is running");
        };

        Thread thread = new Thread(job);
        thread.start();
    }
}

