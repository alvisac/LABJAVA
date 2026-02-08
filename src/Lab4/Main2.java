package Lab4;

class Main2
{
    int grade;

    Main2(int grade){
        this.grade= grade;
        System.out.println("this reference = " + this);
    }

    public static void main(String[] args) {
        Main2 obj = new Main2(89);
        System.out.println("object reference = " + obj);
    }
}
