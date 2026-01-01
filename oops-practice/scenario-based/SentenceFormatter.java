public class SentenceFormatter {

    public String formatParagraph(String paragraph) {
        paragraph = paragraph.trim();

        StringBuilder result = new StringBuilder();
        boolean nextUpperCase = true;
        boolean lastWasSpace = false;

        for (int i = 0; i < paragraph.length(); i++) {
            char curr = paragraph.charAt(i);

            if (curr == ' ') {
                if (!lastWasSpace && result.length() > 0) {
                    result.append(' ');
                    lastWasSpace = true;
                }
                continue;
            }

            lastWasSpace = false;

            // capitalize first letter
            if (nextUpperCase && Character.isAlphabetic(curr)) {
                result.append(Character.toUpperCase(curr));
                nextUpperCase = false;
            } else {
                result.append(curr);
            }

            // punctuation
            if (curr == '.' || curr == '?' || curr == '!') {
                nextUpperCase = true;

                // only one space after punctuation
                if (i + 1 < paragraph.length() && paragraph.charAt(i + 1) != ' ') {
                    result.append(' ');
                    lastWasSpace = true;
                }
            }

            
            if (curr == ',') {
                if (i + 1 < paragraph.length() && paragraph.charAt(i + 1) != ' ') {
                    result.append(' ');
                    lastWasSpace = true;
                }
            }
        }

        return result.toString().trim();
    }

    public static void main(String[] args) {
        SentenceFormatter formatter = new SentenceFormatter();
        String paragraph =
                "   lorem,ipsum.lorem ipsum.one.two!three.   ";
        System.out.println(formatter.formatParagraph(paragraph));
    }
}
