package Lab9;

class Main {
    private int stuID;
    private String stuName;
    private int stuAge;

    // constructor
    Main() {
        System.out.println("Constructor Called:");

        stuName = "New Student";
        stuAge = 18;
        stuID = 1007;
    }
    public static void main(String[] args) {

        //The constructor is invoked while
        // creating an object of the Main class
        Main obj = new Main();

        System.out.println("Student Name: " + obj.stuName);
        System.out.println("Student Age: " + obj.stuAge);
        System.out.println("Student ID: " + obj.stuID);
    }
}
