package results;

import java.util.ArrayList;
import java.util.List;

public class RankSheetMain {

    public static void main(String[] args) {

        // Sorted district-wise marks
        int[] district1 = {45, 60, 78};
        int[] district2 = {50, 70, 80};
        int[] district3 = {55, 65, 90};

        List<Integer> combined = new ArrayList<>();

        addAll(combined, district1);
        addAll(combined, district2);
        addAll(combined, district3);

        // Convert list to array
        int[] allMarks = combined.stream().mapToInt(i -> i).toArray();

        MergeSort.sort(allMarks);

        System.out.println("State-wise Rank List:");
        for (int mark : allMarks) {
            System.out.print(mark + " ");
        }
    }

    private static void addAll(List<Integer> list, int[] arr) {
        for (int x : arr) {
            list.add(x);
        }
    }
}

