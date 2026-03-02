package lab6;

class Main1 {
    public static void main(String[] args) {

        int count = 0;
        int n = 1000;

        // for loop
        for (int i = 1; i <= n; i++) {
            if (i % 7 != 0) {
                count ++;
            }
        }

        System.out.println("Number of numbers NOT multiples of 7 are: " + count);
    }
}
