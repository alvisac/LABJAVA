package Lab9;

import java.util.Scanner;

public class DemoRunners {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter the type of runner:");
        System.out.println("1 - Machine");
        System.out.println("2 - Athlete");
        System.out.println("3 - Political Candidate");

        int choice = input.nextInt();

        Runner runner;

        if (choice == 1) {
            runner = new Machine();
        }
        else if (choice == 2) {
            runner = new Athlete();
        }
        else if (choice == 3) {
            runner = new PoliticalCandidate();
        }
        else {
            System.out.println("Invalid option.");
            input.close();
            return;
        }

        runner.run();

        input.close();
    }
}