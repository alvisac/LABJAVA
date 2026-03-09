package Lab8;

public class ArrayGradeDemo {
    public static void main(String[] args) {
        //creating an array to store student names
        String[] students = {"Charlie", "Mary", "Ronnie"};
        //creating a two-dimensional array to store the grade of each student
        int[][] grades = {
                {85, 67, 92},
                {96, 90, 80},
                {75, 81, 70}
        };
        for (int i = 0; i < students.length; i++) {
            int total = 0;
            System.out.println("\nStudent: " + students[i]);

            for (int j = 0; j < grades[i].length; j++) {
                System.out.println(" " + grades[i][j]);
                total += grades[i][j];
            }
            double average = total / (double) grades[i].length;
            System.out.printf("Average: %.2f%n",average);
        }
    }
}
