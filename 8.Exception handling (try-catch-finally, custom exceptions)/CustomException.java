import java.util.Scanner;

class AgeNotValidException extends Exception {
    public AgeNotValidException(String message) {
        super(message);
    }
}
public class CustomException {
    public static void main(String[] args) {
        int age;
        System.out.println( "enter the age :- ");
        Scanner sc = new Scanner(System.in);
        age =sc.nextInt();
        try {
        
            if (age < 18) {
                throw new AgeNotValidException("Age is less than 18. You cannot proceed.");
            }
            
            System.out.println("You are eligible.");
        } catch (AgeNotValidException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
