public class SearchWordInSentences {

    public static void main(String[] args) {
        String[] sentences = {
            "Java is a powerful language",
            "Linear search is simple",
            "File handling in Java",
            "Data structures are important"
        };

        String word = "search";
        String result = findSentenceContainingWord(sentences, word);
        System.out.println(result);
    }

    static String findSentenceContainingWord(String[] sentences, String word) {
        for (String sentence : sentences) {
            if (sentence.contains(word)) {
                return sentence;
            }
        }
        return "Not Found";
    }
}
