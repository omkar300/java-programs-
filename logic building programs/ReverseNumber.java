import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number to reverse");
        int num= sc.nextInt();
        int reverse =0;
        while (num!=0)
        {
            int digit =num %10;
            reverse = reverse * 10 +digit;
            num /=10;
        }
        System.out.println("reversed number : "+reverse);
       sc.close();
    }
}
