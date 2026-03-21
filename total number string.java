import java.util.Scanner;

public class CountVowelsConsonants {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get the input string from the user
        System.out.println("Enter a string: ");
        String str = scanner.nextLine();

        // Initialize the vowel and consonant counters
        int vowelCount = 0;
        int consonantCount = 0;

        // Convert the string to lowercase
        str = str.toLowerCase();

        // Iterate over the string and count the vowels and consonants
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            // Check if the character is a vowel
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                vowelCount++;
            }
            // Check if the character is a consonant
            else if (ch >= 'a' && ch <= 'z') {
                consonantCount++;
            }
        }

        // Print the vowel and consonant counts
        System.out.println("Number of vowels: " + vowelCount);
        System.out.println("Number of consonants: " + consonantCount);
    }
}