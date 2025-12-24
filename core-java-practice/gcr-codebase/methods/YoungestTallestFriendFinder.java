import java.util.Scanner;

public class YoungestTallestFriendFinder {
    public static String findYoungest(String[] names, int[] ageArr) {
        int min = ageArr[0], index = 0;
        for (int i = 1; i < ageArr.length; i++) {
            if (ageArr[i] < min) {
                min = ageArr[i];
                index = i;
            }
        }
        return names[index];
    }

    public static String findTallest(String[] names, int[] heights) {
        int max = heights[0], indx = 0;
        for (int i = 1; i < heights.length; i++) {
            if (heights[i] > max) {
                max = heights[i];
                indx = i;
            }
        }
        return names[indx];
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] names = { "Amar", "Akbar", "Anthony" };
        int[] ages = new int[3];
        int[] heights = new int[3];
        for (int i = 0; i < 3; i++) {
            System.out.print("Enter age of " + names[i] + ": ");
            ages[i] = sc.nextInt();
            System.out.print("Enter height of " + names[i] + ": ");
            heights[i] = sc.nextInt();
        }
        System.out.println("Youngest: " + findYoungest(names, ages));
        System.out.println("Tallest: " + findTallest(names, heights));
    }
}