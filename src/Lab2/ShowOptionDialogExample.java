package Lab2;

import javax.swing.*;
public class ShowOptionDialogExample {
    public static void main(String[] args) {
        /* JOptionPane Java user input example */
        String[] options = { "Spring","Fall"};
        var dessert = JOptionPane.showOptionDialog(null, "Which season do you prefer?", "Select one:",
                0, 3, null, options, options[0]);
        if (dessert == 0) {
            JOptionPane.showMessageDialog(null, "You chose Spring!");
        }
        if (dessert == 1) {
            JOptionPane.showMessageDialog(null, "You chose Summer!");
        }
    }

    /*
    What is the Output?
    Answer = The output is a GUI(Graphical User Interface), basically when we run the program
    a dialog box will appear,and it will say "Which season do you prefer?" and there will be two buttons
     */

    /*
    Explain the difference between the Scanner class and JOptionPane class
    Answer = Scanner class is for console application, where the user would type in the console to give input.
    JOptionPane class is for GUI(Graphical User Interface) applications, where the user interacts with the
     */


}