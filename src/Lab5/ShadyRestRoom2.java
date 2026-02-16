
package Lab5;
import java.util.Scanner;


public class ShadyRestRoom2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int bedChoice;
        int viewChoice;
        double price = 0;
        boolean validBed = true;

        System.out.print("Enter bed type (1 = Queen, 2 = King, 3 = King with pullout couch): ");
        bedChoice = input.nextInt();

        switch (bedChoice) {
            case 1:
                price = 125;
                System.out.println("You selected a Queen bed.");
                break;
            case 2:
                price = 139;
                System.out.println("You selected a King bed.");
                break;
            case 3:
                price = 165;
                System.out.println("You selected a King bed with a pullout couch.");
                break;
            default:
                System.out.println("Invalid bed selection.");
                price = 0;
                validBed = false;
        }

        if (validBed) {
            System.out.print("Enter view type (1 = Lake view, 2 = Park view): ");
            viewChoice = input.nextInt();

            if (viewChoice == 1) {
                price += 15;
                System.out.println("Lake view selected.");
            } else if (viewChoice == 2) {
                System.out.println("Park view selected.");
            } else {
                System.out.println("Invalid view selection. Lake view assumed.");
                price += 15;
            }
        }

        System.out.println("Final room price: $" + price);
    }
}
