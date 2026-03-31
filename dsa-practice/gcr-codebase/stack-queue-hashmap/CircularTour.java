public class CircularTour {

    static int tour(int[] petrol, int[] distance) {
        int total = 0, curr = 0, start = 0;

        for (int i = 0; i < petrol.length; i++) {
            int diff = petrol[i] - distance[i];
            total += diff;
            curr += diff;

            if (curr < 0) {
                start = i + 1;
                curr = 0;
            }
        }
        return total >= 0 ? start : -1;
    }

    public static void main(String[] args) {
        int[] petrol = {4, 6, 7, 4};
        int[] distance = {6, 5, 3, 5};

        System.out.println(tour(petrol, distance));
    }
}
