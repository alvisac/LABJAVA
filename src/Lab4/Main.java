package Lab4;

class Course
{
    String courseName;
    // public constructor
    public Course() {
        courseName = "Java Programming I (no-arg constructor)";
    }
}
class Main {
    public static void main(String[] args) {

        //The object is created in another class
        Course obj = new Course();
        System.out.println("Course title = " + obj.courseName);
    }
}
