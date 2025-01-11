class car{
    String brand;
    int year;

    car(String brand ,int year)
    {
        this.brand= brand;
        this.year = year;
    }
    void display()
    {
        System.out.print(" brand: "+ brand );
        System.out.println(" year:"+ year);

    }
}
public class main {

public static void main(String[] args) {
    
    car car1=new car("toyota", 2002);
    car car2= new car("BMW", 2003 );

    car1.display();
    car2.display();

}    
}