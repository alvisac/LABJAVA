package Lab2;

import java.util.Scanner;

public class MileConversionsInteractive {
    public static void main(String[] args)
    {
        final int INCHES_IN_A_MILE = 63360;
        final int FEET_IN_A_MILE = 5280;
        final int YARDS_IN_A_MILE = 1760;

        Scanner input = new Scanner(System.in);
        System.out.println("Enter Miles: ");
        double miles = input.nextDouble();

        double inches = miles * INCHES_IN_A_MILE;
        double feet = miles * FEET_IN_A_MILE;
        double yards = miles * YARDS_IN_A_MILE;
        System.out.println("Miles: " + miles);
        System.out.println(miles + " miles is equivalent to:");
        System.out.println(inches + " inches");
        System.out.println(feet + " feet");
        System.out.println(yards + " yards");
    }
}