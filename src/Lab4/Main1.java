package Lab4;

class Main1
{
    String universityName;
    // constructor accepting a single value
    Main1(String name) {
        universityName = name;
        System.out.println("University: " + universityName);
    }

    public static void main(String[] args) {

        // call the constructor by passing a single value
        Main1 obj1 = new Main1("Keiser");
        Main1 obj2 = new Main1("Harvard");
        Main1 obj3 = new Main1("Columbia");
    }
}
