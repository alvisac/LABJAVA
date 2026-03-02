package Lab7;

import java.util.Scanner;

public class PhoneNumberFormat {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String input;

        while (true) {
            System.out.print("Enter a 10-digit phone number (or 999 to quit): ");
            input = scanner.nextLine();

            if (input.equals("999")) {
                System.out.println("Program terminated.");
                break;
            }

            if (input.length() != 10 || !input.matches("\\d{10}")) { System.out.println("Error: Please enter exactly 10 digits.");
                continue;
            }


            String formatted =  "(" + input.substring(0, 3) + ")"  + input.substring(3, 6) + "-" + input.substring(6);

            System.out.println("Formatted phone number: " + formatted);
        }

    }
}