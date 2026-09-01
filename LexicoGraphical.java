import java.util.Scanner;

public class LexicoGraphical {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input string and window size k
        String s = sc.nextLine();
        int k = sc.nextInt();

        // Initialize smallest and largest with the first substring
        String smallest = s.substring(0, k);
        String largest = s.substring(0, k);

        // Traverse all substrings of length k
        for (int i = 1; i <= s.length() - k; i++) {
            String current = s.substring(i, i + k);

            // Case-insensitive comparison
            if (current.compareToIgnoreCase(smallest) < 0) {
                smallest = current;
            }
            if (current.compareToIgnoreCase(largest) > 0) {
                largest = current;
            }
        }

        // Output results
        System.out.println("Smallest substring: " + smallest);
        System.out.println("Largest substring: " + largest);

        sc.close();
    }
}
