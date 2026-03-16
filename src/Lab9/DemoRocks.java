package Lab9;

import java.util.Scanner;

public class DemoRocks {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        Rock rock;

        System.out.print("Enter rock type (U = Unclassified, I = Igneous, S = Sedimentary, M = Metamorphic): ");
        String type = input.nextLine().toUpperCase();

        if(!type.equals("U") && !type.equals("I") && !type.equals("S") && !type.equals("M")){
            rock = new Rock(0,0);
        }
        else{
            System.out.print("Enter sample number: ");
            int num = input.nextInt();

            System.out.print("Enter weight in grams: ");
            double weight = input.nextDouble();

            switch(type){
                case "U":
                    rock = new Rock(num, weight);
                    break;

                case "I":
                    rock = new IgneousRock(num, weight);
                    break;

                case "S":
                    rock = new SedimentaryRock(num, weight);
                    break;

                case "M":
                    rock = new MetamorphicRock(num, weight);
                    break;

                default:
                    rock = new Rock(0,0);
            }
        }

        displayRock(rock);
    }

    public static void displayRock(Rock rock){
        System.out.println("\nRock Details:");
        System.out.println("Sample Number: " + rock.getNum());
        System.out.println("Description: " + rock.getDescription());
        System.out.println("Weight: " + rock.getWeight() + " grams");
    }
}