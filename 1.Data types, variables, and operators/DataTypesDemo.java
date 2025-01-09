public class DataTypesDemo {
    public static void main(String[] args) {
        // Data types and variables
        int age = 25;        // Integer
        float price = 19.99f; // Float
        char grade = 'A';    // Character
        boolean isPassed = true; // Boolean

        // Arithmetic Operators
        int num1 = 10, num2 = 20;
        System.out.println("Addition: " + (num1 + num2));
        System.out.println("Multiplication: " + (num1 * num2));

        // Relational Operators
        System.out.println("Is num1 greater than num2? " + (num1 > num2));

        // Logical Operators
        System.out.println("Logical AND: " + (num1 > 5 && num2 < 30));

        // Increment and Decrement
        num1++;
        num2--;
        System.out.println("After Increment: " + num1);
        System.out.println("After Decrement: " + num2);

        // Displaying variables
        System.out.println("Age: " + age);
        System.out.println("Price: " + price);
        System.out.println("Grade: " + grade);
        System.out.println("Passed: " + isPassed);
    }
}
