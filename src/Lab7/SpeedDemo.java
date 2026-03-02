package Lab7;

public class SpeedDemo {

    // main method
    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();
        // creating an object of String
        String str = "Usernames:\n";
        for (int i = 0; i < 20000; i++) {
            // doing the concatenation work
            str += "Player" + i + "\n";
        }
        // displaying the time taken by String
        System.out.println("Time taken by String: " + (System.currentTimeMillis() - startTime) + " ms");

        // resetting the start time
        startTime = System.currentTimeMillis();
        // creating an object of StringBuilder
        StringBuilder strBuilder = new StringBuilder("Usernames:\n");
        for (int i = 0; i < 20000; i++) {
            // doing the concatenation work
            strBuilder.append("Player").append(i).append("\n");
        }
        // displaying the time taken by StringBuilder
        System.out.println("Time taken by StringBuilder: " + (System.currentTimeMillis() - startTime) + " ms");

        // resetting the start time
        startTime = System.currentTimeMillis();
        // creating an object of StringBuffer
        StringBuffer strBuffer = new StringBuffer("Usernames:\n");
        for (int i = 0; i < 20000; i++) {
            // doing the concatenation work
            strBuffer.append("Player").append(i).append("\n");
        }
        // displaying the time taken by StringBuffer
        System.out.println("Time taken by StringBuffer: " + (System.currentTimeMillis() - startTime) + " ms");
    }
}
