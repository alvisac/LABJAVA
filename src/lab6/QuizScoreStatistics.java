package lab6;

import java.util.Scanner;

public class QuizScoreStatistics {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int score;
        int count = 0;
        int highest = Integer.MIN_VALUE;
        int lowest = Integer.MAX_VALUE;
        int sum = 0;

        System.out.println("Enter quiz scores (enter 99 to stop):");

        score = scanner.nextInt();

        while (score != 99) {

            if (score < 0 || score > 10) {
                System.out.println("Invalid score. Enter a value between 0 and 10.");
            } else {
                count++;
                sum += score;

                if (score > highest) {
                    highest = score;
                }

                if (score < lowest) {
                    lowest = score;
                }
            }

            score = scanner.nextInt();
        }

        if (count > 0) {
            double average = (double) sum / count;

            System.out.println("\nResults:");
            System.out.println("Number of scores entered: " + count);
            System.out.println("Highest score: " + highest);
            System.out.println("Lowest score: " + lowest);
            System.out.println("Average score: " + average);
        } else {
            System.out.println("No valid scores were entered.");
        }

        scanner.close();
    }
}