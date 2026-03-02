package lab6;

import java.util.Scanner;

public class CountByAnything {
    public static void main(String[] args) {
        final int START = 10;
        final int STOP = 500;
        int count;
        int printed = 0;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number to count by: ");
        count = scanner.nextInt();

        for (int i = START; i <= STOP; i += count) {
            System.out.print(i + " ");
            printed++;
            if (printed % 10 == 0) {
                System.out.println();
            }
        }
    }
}

