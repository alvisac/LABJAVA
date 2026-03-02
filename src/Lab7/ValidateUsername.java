package Lab7;

import java.util.Scanner;

public class ValidateUsername {
    public static final int USERNAME_LENGTH = 7;

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print(
                """
                        1. A username must be at least seven characters long.
                        2. A username must start with a letter.
                        3. A username must contain at least one digit.
                        Input a username:\s""");

        String s = input.nextLine();
        if (is_Valid_Username(s)) {
            System.out.println("This username is valid: " + s);
        } else {
            System.out.println("This is not a valid username: " + s);
        }
    }

    public static boolean is_Valid_Username(String username) {
        if (username.length() < USERNAME_LENGTH) return false;
        if (!is_Letter(username.charAt(0))) return false;

        int numCount = 0;

        for (int i = 0; i < username.length(); i++) {
            char ch = username.charAt(i);
            if (is_Numeric(ch)) numCount++;
            else if (is_Letter(ch));
            else return false;
        }

        return (numCount >= 1);
    }

    public static boolean is_Letter(char ch) {
        ch = Character.toUpperCase(ch);
        return (ch >= 'A' && ch <= 'Z');
    }

    public static boolean is_Numeric(char ch) {
        return (ch >= '0' && ch <= '9');
    }
}
