package Lab7;

import java.util.Scanner;

public class ThreeLetterAcronym {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter words to create an acronym: ");
        String line = input.nextLine();


        String[] words = line.split("\\s+");


        String acronym = "";

        for (int i = 0; i < words.length && i < 3; i++) {
            acronym += words[i].charAt(0);
        }


        System.out.println("Acronym: " + acronym.toUpperCase());

    }
}