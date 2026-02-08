package Lab4;

import javax.swing.*;
import java.time.LocalDate;
import java.time.Month;

public class DaysUntilNextMonth {
    public static void main(String[] args) {

        int month = Integer.parseInt(JOptionPane.showInputDialog("Enter a month (1-12):"));
        int day = Integer.parseInt(JOptionPane.showInputDialog("Enter a day:"));
        int year = Integer.parseInt(JOptionPane.showInputDialog("Enter the year:"));

        // Create the date using java.time.LocalDate
        LocalDate date = LocalDate.of(year, month, day);

        int daysInMonth = date.lengthOfMonth();

        // Days until the first day of next month (counting forward days)
        int daysUntilNextMonth = daysInMonth - day + 1;

        // Get next month name
        Month nextMonth = date.plusMonths(1).getMonth();

        String message = "There are " + daysUntilNextMonth + " days until " + nextMonth + " starts.";
        JOptionPane.showMessageDialog(null, message);
    }
}
