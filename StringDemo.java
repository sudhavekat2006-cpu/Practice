import java.util.Scanner;

public class StringDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the sentence:");
        String sentence = sc.nextLine();


        int vowels = 0;
        int characters = 0;

        String lower = sentence.toLowerCase();

        for (int i = 0; i < lower.length(); i++) {
            char ch = lower.charAt(i);

            if (ch != ' ') {
                characters++;
            }

            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                vowels++;
            }
        }


        System.out.println("Characters : " + characters);
        System.out.println("Vowels: " + vowels);
        System.out.println(sentence.substring(0,16));
        sc.close();

    }
}
