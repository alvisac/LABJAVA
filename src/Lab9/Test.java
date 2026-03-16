package Lab9;

class Rhombus {
    double d1, d2;

    // constructor with no parameters
    Rhombus() {
        d1 = d2 = 0;
    }
    // constructor with a single parameter
    Rhombus(double diagonal) {
        d1 = d2 = diagonal;
    }
    // Constructor with two parameters
    Rhombus(double diagonal1, double diagonal2) {
        d1 = diagonal1;
        d2 = diagonal2;
    }
    // Method to compute area
    double area() {
        return (d1 * d2) / 2;
    }
}
public class Test {
    public static void main(String [] args) {
        Rhombus r1 = new Rhombus(13, 5);
        Rhombus r2 = new Rhombus();
        Rhombus r3 = new Rhombus(8);

        System.out.println("Area of rhombus 1 is " + r1.area());
        System.out.println("Area of rhombus 2 is " + r2.area());
        System.out.println("Area of rhombus 3 is " + r3.area());
    }
}
