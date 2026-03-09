package Lab8;

import java.util.Scanner;

public class EmergencyContacts {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        final int MAX = 6;
        final String QUIT = "ZZZ";

        String[] names = new String[MAX];
        String[] contacts = new String[MAX];
        int count = 0;

        while (count < MAX) {
            System.out.print("Enter relative name or " + QUIT + " to quit: ");
            String name = keyboard.nextLine();
            if (name.equalsIgnoreCase(QUIT)) {
                break;
            }
            String number;
            while (true) {
                System.out.print("Enter contact number (8 digits): ");
                number = keyboard.nextLine();

                if (number.length() == 8) {
                    boolean allDigits = true;
                    for (int i = 0; i < number.length(); i++) {
                        if (!Character.isDigit(number.charAt(i))) {
                            allDigits = false;
                            break;
                        }
                    }
                    if (allDigits) {
                        break;
                    }
                }
                System.out.println("Invalid phone number! Please enter exactly 8 digits");
            }
            number = number.substring(0, 4) + "-" + number.substring(4);
            names[count] = name;
            contacts[count] = number;
            count++;
        }
        System.out.println("Emergency contact list:");
        for (int i = 0; i < count; i++) {
            System.out.println(names[i] + ": " + contacts[i]);
        }
    }
}
