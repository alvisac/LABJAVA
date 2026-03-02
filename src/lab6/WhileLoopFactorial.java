package lab6;

class WhileLoopFactorial{
    public static void main(String[] args)
    {
        int x = 1;
        int factorial = 1;

        // Exit when x becomes greater than 10
        while (x <= 10) {
            // multiplying by x
            factorial = factorial * x;

            // Increment the value of x for
            // next iteration
            x++;
        }
        System.out.println("Factorial of 10: " + factorial);
    }
}
