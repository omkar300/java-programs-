public class LoopComparison {
    public static void main(String[] args) {
        System.out.println("Using for loop:");
        for (int i = 2; i <= 10; i += 2) {
            System.out.println(i);
        }

        System.out.println("Using while loop:");
        int j = 2;
        while (j <= 10) {
            System.out.println(j);
            j += 2;
        }

        System.out.println("Using do-while loop:");
        int k = 2;
        do {
            System.out.println(k);
            k += 2;
        } while (k <= 10);
    }
}
