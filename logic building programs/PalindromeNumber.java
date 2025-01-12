import java.util.Scanner;

public class PalindromeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
    System.out.print("enter the number to check if its palindrome : ");  
    int num =sc.nextInt();
    int original =num ,reversed =0;
    
    while (num != 0)
     {
        int digit = num % 10;
        reversed = reversed * 10 + digit;
        num = num/10;
    }

        
    if (original== reversed)
    {
        System.out.println(original+"is Palindrome Number.");

    }
    else{
        System.out.println(original+"is not a palindrome Number  ");
    }
  sc.close();
}
}
