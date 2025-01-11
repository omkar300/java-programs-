
interface Animal {
    void sound();  // Abstract method
}

class Cat implements Animal {
    @Override
    public void sound() {
        System.out.println("The cat meows.");
    }
}

class Cow implements Animal {
    @Override
    public void sound() {
        System.out.println("The cow moos.");
    }
}

public class Interface{
    public static void main(String[] args) {
        Animal a1 = new Cat();
        Animal a2 = new Cow();
        a1.sound();
        a2.sound();
    }
}
