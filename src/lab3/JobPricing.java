package lab3;

import java.util.Scanner;

public class JobPricing {
    public static void main(String[] args) {
        String jobName;
        double materialsCost;
        double workHours;
        double travelTime;
        double estimated;

        //now the scanner
        Scanner input = new Scanner(System.in);
        System.out.println("Hello, please enter the name of the job: ");
        jobName = input.nextLine();

        System.out.println("Now, enter the cost of materials: ");
        materialsCost = input.nextDouble();

        System.out.println("Then, enter the work hours: ");
        workHours = input.nextDouble();

        System.out.println("And the last thing, can you please enter the hours traveled?");
        travelTime = input.nextDouble();

        estimated = computeEstimated(materialsCost, workHours, travelTime);

        System.out.println("Job: " + jobName);
        System.out.println("The estimated cost for this remodeling is: " + estimated + "$");
    }
    public static double computeEstimated(double materials, double work, double travel){
        return materials + (35 * work) + (12 * travel);





    }
}