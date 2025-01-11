import java.util.Scanner;

public class ExceptionHandling {
    public static void main(String[] args) {
        int num1;
        int num2 ;
        Scanner sc  = new Scanner(System.in);
        System.out.print("Enter number 1 :");
        num1 = sc.nextInt();
        System.out.print("Enter number 2 :");
        num2=sc.nextInt();
        
        try {
            int result = num1 / num2;  // This will throw an ArithmeticException
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Error: Division by zero is not allowed.");
        } finally {
            System.out.println("Finally block is always executed.");
        }
    }
}
