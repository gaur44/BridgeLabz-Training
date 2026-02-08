import java.util.*;
import java.util.stream.Collectors;

public class WordFrequencyCounter {

    public static void main(String[] args) {

        String paragraph = "java is easy and java is powerful";

        List<String> words = Arrays.asList(paragraph.split(" "));

        Map<String, Integer> wordCount =
                words.stream()
                     .collect(Collectors.toMap(
                             word -> word,
                             word -> 1,      
                             Integer::sum
                     ));

        System.out.println(wordCount);
    }
}

