public class Task5 {
    public static String reconstructSentence(String s) {
        String[] words = new String[9];
        int wordCount = 0;
        
        // Manually split the sentence into words
        for (int i = 0; i < s.length(); i++) {
            StringBuilder word = new StringBuilder();
            while (i < s.length() && s.charAt(i) != ' ') {
                word.append(s.charAt(i));
                i++;
            }
            if (word.length() > 0) {
                words[wordCount++] = word.toString();
            }
        }

        // Bubble sort to sort words based on the last character (index)
        for (int i = 0; i < wordCount - 1; i++) {
            for (int j = 0; j < wordCount - 1 - i; j++) {
                if (words[j].charAt(words[j].length() - 1) > words[j + 1].charAt(words[j + 1].length() - 1)) {
                    String temp = words[j];
                    words[j] = words[j + 1];
                    words[j + 1] = temp;
                }
            }
        }

        // Build the original sentence
        StringBuilder originalSentence = new StringBuilder();
        for (int i = 0; i < wordCount; i++) {
            // Remove the last character (index) from each word
            for (int j = 0; j < words[i].length() - 1; j++) {
                originalSentence.append(words[i].charAt(j));
            }
            if (i < wordCount - 1) {
                originalSentence.append(" ");
            }
        }

        return originalSentence.toString();
    }

    public static void main(String[] args) {
        String shuffledSentence = "sentence4 a3 is2 This1";
        String originalSentence = reconstructSentence(shuffledSentence);
        System.out.println(originalSentence);
    }
}
