package lab3;

public class Main1 {

    // method defined
    private static int getSquare2(int x){
        return x * x;
    }

    public static void main(String[] args) {
        for (int i = 1; i < 16; i++) {

            // method call
            int result = getSquare2(i);
            System.out.println("The square of number " + i + " is: " + result);
        }
    }
}
