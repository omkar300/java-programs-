//Example of Method Overloading:-

class calculator{
    int add(int a,int b)
    {
      return a+b;   
    }
    int add(int a,int b,int c)
    {
        return a+b+c;
    }
}

public class Polymorphism {
    public static void main(String[] args) {
        calculator calc = new calculator();
        System.out.println(calc.add(4, 05));
        System.err.println(calc.add(4, 50, 06));
    }
}
