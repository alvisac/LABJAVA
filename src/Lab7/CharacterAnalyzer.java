package Lab7;

import java.util.Scanner;

public class CharacterAnalyzer  {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a sentence: ");
        String sentence = input.nextLine();
        analyzeText(sentence);
    }
    public static void analyzeText(String text) {
        int vowel = 0;
        int consonant = 0;
        int digit = 0;
        int space = 0;
        int symbol= 0;

        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);

            if (Character.isLetter(ch)) {
                char lower = Character.toLowerCase(ch);
                if (lower == 'a' || lower == 'e' || lower == 'i' || lower == 'o' || lower == 'u') {
                    vowel++;
                } else {
                    consonant++;
                }
            } else if (Character.isDigit(ch)) {
                digit++;
            } else if (Character.isWhitespace(ch)) {
                space++;
            } else {
                symbol++;
            }
        }
        String str1 = "Vowels: " + vowel;
        String str2 = "Consonants: " + consonant;
        String str3 = "Digits: " + digit;
        String str4 = "Spaces: " + space;
        String str5 = "Symbols: " + symbol;

        System.out.println("Character Analysis\n");
        System.out.println(str1);
        System.out.println(str2);
        System.out.println(str3);
        System.out.println(str4);
        System.out.println(str5);
    }
}

