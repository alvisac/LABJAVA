package lab6;

import java.util.Scanner;

public class Population {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double mexicoPopulation = 128_000_000;
        double usPopulation = 323_000_000;

        System.out.print("Enter Mexico's annual population increase: ");
        double mexicoRate = scanner.nextDouble();

        System.out.print("Enter U.S. annual population decrease: ");
        double usRate = scanner.nextDouble();

        int years = 0;

        System.out.println("\nYear\tMexico Population\tU.S. Population");

        while (mexicoPopulation <= usPopulation) {
            years++;

            mexicoPopulation += mexicoPopulation * mexicoRate;
            usPopulation -= usPopulation * usRate;

            System.out.printf(
                    "%d\t%.0f\t\t%.0f%n",
                    years,
                    mexicoPopulation,
                    usPopulation
            );
        }

        System.out.println("\nIt took " + years + " years for Mexico's population to exceed the U.S. population.");

        scanner.close();
    }
}