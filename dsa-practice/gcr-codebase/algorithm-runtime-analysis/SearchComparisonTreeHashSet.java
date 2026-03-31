import java.util.*;

public class SearchComparison {

    public static void main(String[] args) {

        int N = 1_000_000;
        int target = N - 1;

        // Array
        int[] arr = new int[N];
        for (int i = 0; i < N; i++)
            arr[i] = i;

        long start = System.currentTimeMillis();
        for (int i = 0; i < N; i++) {
            if (arr[i] == target)
                break;
        }
        long end = System.currentTimeMillis();
        System.out.println("Array search time: " + (end - start) + " ms");

        // HashSet
        HashSet<Integer> hashSet = new HashSet<>();
        for (int i = 0; i < N; i++)
            hashSet.add(i);

        start = System.currentTimeMillis();
        hashSet.contains(target);
        end = System.currentTimeMillis();
        System.out.println("HashSet search time: " + (end - start) + " ms");

        // TreeSet
        TreeSet<Integer> treeSet = new TreeSet<>();
        for (int i = 0; i < N; i++)
            treeSet.add(i);

        start = System.currentTimeMillis();
        treeSet.contains(target);
        end = System.currentTimeMillis();
        System.out.println("TreeSet search time: " + (end - start) + " ms");
    }
}

