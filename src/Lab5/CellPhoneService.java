package Lab5;

import java.util.Scanner;

public class CellPhoneService {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int talkMinutes;
        int textMessages;
        double dataGigabytes;

        System.out.print("Enter maximum monthly talk minutes needed: ");
        talkMinutes = input.nextInt();

        System.out.print("Enter maximum monthly text messages needed: ");
        textMessages = input.nextInt();

        System.out.print("Enter maximum monthly gigabytes of data needed: ");
        dataGigabytes = input.nextDouble();

        String plan;
        double price;

        // Any data -> Plan E or F
        if (dataGigabytes > 0) {
            if (dataGigabytes < 3) {
                plan = "Plan E";
                price = 79.00;
            } else {
                plan = "Plan F";
                price = 87.00;
            }
        }
        // No data
        else {
            // Fewer than 500 talk minutes
            if (talkMinutes < 500) {
                // No text
                if (textMessages == 0) {
                    plan = "Plan A";
                    price = 49.00;
                }
                // Any text
                else {
                    plan = "Plan B";
                    price = 55.00;
                }
            }
            // 500 or more talk minutes (and no data)
            else {
                if (textMessages <= 100) {
                    plan = "Plan C";
                    price = 61.00;
                } else {
                    plan = "Plan D";
                    price = 70.00;
                }
            }
        }

        System.out.println("The best plan for you is " + plan + " at $" + String.format("%.2f", price) + " per month.");

        input.close();
    }
}
