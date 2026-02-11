public class Main {
    public static void main(String[] args) {

        FeedbackService service = new FeedbackService();

        try {
            service.addRating("E1", 5);
            service.addRating("E1", 4);
            service.addRating("E2", 3);
            service.addRating("E2", 6);   // invalid
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        service.report();

        System.out.println("Top event: " + service.topEvent());
    }
}
