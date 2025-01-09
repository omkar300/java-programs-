public class InfiniteLoop {
    public static void main(String[] args) {
        int i = 1;
        while (true) { // Infinite loop
            System.out.println("Number: " + i);
            i++;
            if (i > 10) break; // Break out of the loop after 10 iterations
        }
    }
}
