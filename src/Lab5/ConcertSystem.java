package Lab5;

public class ConcertSystem
{
    public static void main(String[] args) {
        int age = 24;
        boolean VIPPass = false;

        if (age >= 16) {
            System.out.println("You are eligible to attend the concert.");

            if (VIPPass) {
                System.out.println("You have a VIP pass. Enjoy premium seating and backstage access!");
            } else {
                System.out.println("You need to purchase a regular ticket.");
            }
        } else {
            System.out.println("Sorry, you are not eligible to attend the concert.");
        }
    }
}
