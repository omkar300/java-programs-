import java.util.Scanner;

public class PrimeNumber {

    public static void main(String[] args) {
        Scanner sc = new  Scanner(System.in);
        System.out.println("enter the number to chek if it's a prime number :  ");
        int num = sc.nextInt();
        boolean isprime = true;
        if(num<1)
        {
            isprime= false;

        }
        else{
            for (int i=2;i<=Math.sqrt(num);i++)
            {
                if (num%1==0)
                {
                    isprime=false;
                    break;
                }
            }
        }
        if(isprime)
        {
            System.out.println(num+" is a prime number ");

        }
        else{
            System.out.println(num+" is not prime number ");
        }
    }
}