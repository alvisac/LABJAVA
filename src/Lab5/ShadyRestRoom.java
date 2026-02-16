package Lab5;

import javax.swing.*;

public class ShadyRestRoom {
    public static void main(String[] args){
        int choice = Integer.parseInt(JOptionPane.showInputDialog("Enter bed type (1 = Queen, 2 = King, 3 = King with pullout couch): "));
        double price = 0;

        switch (choice){
            case 1:

                price = 125;
                JOptionPane.showMessageDialog(null,"You selected a queen bed");
                break;
            case 2:
                price = 139;
                JOptionPane.showMessageDialog(null,"You selected a king bed");
                break;
            case 3:
                price =165;
                JOptionPane.showMessageDialog(null,"You selected a suit with a king bed");
                break;
            default:
                System.out.println("Invalid selection");



        }
        JOptionPane.showMessageDialog(null,"The room price is: "  + price);
    }
}
