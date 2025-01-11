public class ThrowsKeyword {
    public static void main(String[] args) {
        try {
            Test.checkAge(15);  // This will throw a custom exception
        } catch (AgeNotValidException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
class Test {
    // Method that throws an exception
    public static void checkAge(int age) throws AgeNotValidException {
        if (age < 18) {
            throw new AgeNotValidException("Age is less than 18.");
        } else {
            System.out.println("You are eligible.");
        }
    }
}