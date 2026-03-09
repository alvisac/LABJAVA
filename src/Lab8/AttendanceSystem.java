package Lab8;

import java.util.Scanner;

public class AttendanceSystem {
    enum AttendanceStatus {
        PRESENT, ABSENT, LATE
    }
    static class Worker {
        String name;
        AttendanceStatus status;

        Worker(String name, AttendanceStatus status) {
            this.name = name;
            this.status = status;
        }
        void display() {
            System.out.println(name + ": " + status);
        }
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Worker[] workers = new Worker[5];

        for (int i = 0; i < workers.length; i++) {
            String name;
            do {
                System.out.print("Enter the worker name: ");
                name = input.nextLine().trim();
            } while (name.isEmpty());

            System.out.print("Enter attendance status (PRESENT, ABSENT,or LATE): ");
            String status = input.nextLine().trim().toUpperCase();

            AttendanceStatus attendanceStatus;
            if (status.equals("PRESENT")) {
                attendanceStatus = AttendanceStatus.PRESENT;
            } else if (status.equals("LATE")) {
                attendanceStatus = AttendanceStatus.LATE;
            } else {
                attendanceStatus = AttendanceStatus.ABSENT;
            }
            workers[i] = new Worker(name, attendanceStatus);
        }
        int presentCount = 0;
        for (Worker w : workers) {
            w.display();
            if (w.status == AttendanceStatus.PRESENT) presentCount++;
        }
        System.out.println("Total Present: " + presentCount);
    }
}
