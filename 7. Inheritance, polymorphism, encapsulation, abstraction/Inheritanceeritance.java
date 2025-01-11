class animal {
    void eat ()
    {
        System.out.println("enimal eat food ");

    }
}
class Dog extends animal {
    void barck()
    {
        System.out.println("the dog barck ");

    }
}


public class Inheritanceeritance{
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.eat();
        dog.barck();
    }
}
