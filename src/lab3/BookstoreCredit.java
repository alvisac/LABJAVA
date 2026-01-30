package lab3;

import java.awt.desktop.SystemEventListener;
import java.util.Scanner;

public class BookstoreCredit {
    public static void main(String[] args){
        String name;
        double gpa;

        Scanner input = new Scanner(System.in);
        System.out.println("Enter student's name:");
        name = input.nextLine();

        System.out.println("Enter the GPA of the student: ");
        gpa = input.nextDouble();

        DisplayCreditMessage(name,gpa);

    }
    public static void DisplayCreditMessage(String name, double gpa){
        double credit = gpa * 10;

        System.out.println("Hello " + name+"!");
        System.out.println("Your GPA is: "+ gpa + " and your bookstore credits are: "+credit+"$");


    }

}