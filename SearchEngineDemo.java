import java.util.*;

public class SearchEngineDemo {

    // Sample dictionary
    private static final List<String> dictionary = Arrays.asList(
            "apple", "application", "banana", "band", "cat", "catalog", "dog", "door", "google", "good"
    );

    // Check if word exists
    public static boolean isCorrectWord(String word) {
        return dictionary.contains(word.toLowerCase());
    }

    // Suggest closest matches (prefix-based)
    public static List<String> suggestWords(String word) {
        List<String> suggestions = new ArrayList<>();
        for (String dictWord : dictionary) {
            if (dictWord.startsWith(word.toLowerCase())) {
                suggestions.add(dictWord);
            }
        }
        return suggestions;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Type a word: ");
        String input = sc.nextLine();

        if (isCorrectWord(input)) {
            System.out.println("✅ Correct word: " + input);
        } else {
            System.out.println("❌ Word not found. Suggestions:");
            List<String> suggestions = suggestWords(input);
            if (suggestions.isEmpty()) {
                System.out.println("No suggestions available.");
            } else {
                for (String s : suggestions) {
                    System.out.println("-> " + s);
                }
            }
        }

        sc.close();
    }
}
