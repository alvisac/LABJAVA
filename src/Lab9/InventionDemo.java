package Lab9;

import java.util.Scanner;
import java.time.LocalDate;

public class InventionDemo {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter invention description: ");
        String description = input.nextLine();

        System.out.print("Enter inventor name: ");
        String name = input.nextLine();

        System.out.print("Enter inventor country: ");
        String country = input.nextLine();

        System.out.print("Enter year of invention: ");
        int year = input.nextInt();

        System.out.print("Enter month of invention: ");
        int month = input.nextInt();

        System.out.print("Enter day of invention: ");
        int day = input.nextInt();

        Inventor inventor = new Inventor(name, country);
        LocalDate date = LocalDate.of(year, month, day);

        Invention invention = new Invention(description, inventor, date);

        System.out.println("\nInvention Details:");
        System.out.println(invention.toString());

        input.close();
    }
}