import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of terms for the Fibonacci Series: ");
        int n = sc.nextInt();

        if (n <= 0) {
            System.out.println("Please enter a positive integer.");
        } else {
            System.out.println("Fibonacci Series up to " + n + " terms:");

            int first = 0, second = 1;
            System.out.print(first); // Print the first term

            for (int i = 1; i < n; i++) { // Loop starts from 1 because the first term is already printed
                System.out.print(", " + second); // Print the next term

                // Calculate the next term in the series
                int next = first + second;
                first = second;
                second = next;
            }
            System.out.println(); // New line after the series
        }

        sc.close(); // Close the scanner
    }
}
