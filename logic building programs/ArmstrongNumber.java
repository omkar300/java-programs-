import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input: Get a number from the user
        System.out.print("Enter a number to check if it's an Armstrong Number: ");
        int number = sc.nextInt();

        // Check if the number is an Armstrong number
        if (isArmstrong(number)) {
            System.out.println(number + " is an Armstrong Number.");
        } else {
            System.out.println(number + " is not an Armstrong Number.");
        }

        sc.close(); // Close the scanner
    }

    // Method to check if a number is an Armstrong number
    public static boolean isArmstrong(int num) {
        int original = num; // Store the original number
        int sum = 0; // To calculate the sum of powered digits
        int digits = String.valueOf(num).length(); // Number of digits in the number

        while (num > 0) {
            int digit = num % 10; // Extract the last digit
            sum += Math.pow(digit, digits); // Add the digit raised to the power of 'digits'
            num /= 10; // Remove the last digit
        }

        return sum == original; // Compare the sum with the original number
    }
}
