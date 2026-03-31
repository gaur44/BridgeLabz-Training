import java.util.Random;

public class FindDuplicateInArray {
    public static void main(String[] args) {
        int[] array = new int[10];

        Random rand = new Random();

        for (int i = 0; i < array.length; i++) {
            array[i] = rand.nextInt(300); 
        }
        for (int i = 0; i < array.length-1; i++) {
            for (int j = i+1; j < array.length; j++) {
                if (array[i] == array[j]) {
                    System.out.println("Duplicate Elements at:  " + "index " + i + " and index " + j);
                }
            }
        }
        System.out.println("No duplicates found");
    }
}