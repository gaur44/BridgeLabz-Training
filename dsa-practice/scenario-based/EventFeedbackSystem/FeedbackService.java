import java.util.*;

public class FeedbackService {
    Map<String, List<Integer>> data = new HashMap<>();

    // add feedback
    public void addRating(String eventId, int rating)
            throws InvalidRatingException {

        if (rating < 1 || rating > 5) {
            throw new InvalidRatingException("Rating must be 1-5");
        }

        data.putIfAbsent(eventId, new ArrayList<>());
        data.get(eventId).add(rating);
    }

    // average of one event
    public double average(String eventId) {
        List<Integer> list = data.get(eventId);
        if (list == null || list.isEmpty()) return 0;

        int sum = 0;
        for (int r : list) sum += r;
        return (double) sum / list.size();
    }

    // find top rated event
    public String topEvent() {
        String best = null;
        double max = -1;

        for (String id : data.keySet()) {
            double avg = average(id);
            if (avg > max) {
                max = avg;
                best = id;
            }
        }

        return best;
    }

    public void report() {
        for (String id : data.keySet()) {
            System.out.println(id + " avg = " + average(id));
        }
    }
}
