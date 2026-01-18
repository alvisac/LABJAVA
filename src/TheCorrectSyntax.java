import java.util.Scanner;

public class TheCorrectSyntax {
    public static void main(String[] args) {
        System.out.println("Hi there");
        System.out.println("Are you enjoying class?");
        System.out.println();
        System.out.println("Java is fun.");

        Scanner input = new Scanner(System.in);
        System.out.println("Feeling okay today?");
        System.out.print("Your response: ");
        String response = input.nextLine();
    }
}


/*
The errors were:

1. public class TestSyntaxErrors
   --- is missing the opening curly bracket { after the class name

2. public static main(String args)
   --- is missing the keyword void

3. public static main(String args)
   --- String args should be String[] args

4. System.out.println(Hi there)
   --- "Hi there" is missing quotation marks

5. System.out.println("Hi there")
   --- is missing a semicolon at the end

6. system.out.Println("Are you enjoying class"?);
   --- system must be capitalized as System

7. system.out.Println("Are you enjoying class"?);
   --- Println must be lowercase println

8. system.out.Println("Are you enjoying class"?);
   --- the question mark ? must be inside the quotation marks

9. System.out.println()
   --- is missing a semicolon

10. System.println("Java is fun.";
    --- System.println does not exist, it should be System.out.println

11. System.out.println("Java is fun.";
    --- is missing the closing parenthesis )

12. Scanner input = new scanner(System.in);
    --- scanner must be capitalized as Scanner

13. Systems.out.println("Feeling okay today?");
    --- Systems is incorrect, it should be System

14. System.out.print("Your response: ")
    --- is missing a semicolon at the end
*/