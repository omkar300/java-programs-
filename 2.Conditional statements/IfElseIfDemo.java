import java.util.Scanner;

public class IfElseIfDemo {
    public static void main(String[] args) {
        Scanner sc= new Scanner (System.in);
        System.out.println("enter the marks:-");
        int marks = sc.nextInt();

        if (marks >= 90) {
            System.out.println("Grade: A+");
        } else if (marks >= 75) {
            System.out.println("Grade: A");
        } else if (marks >= 50) {
            System.out.println("Grade: B");
        } else {
            System.out.println("Grade: Fail");
        }
    }
}
