import java.util.*;
public class ArrayListExample {

public static void main(String[] args) {
    ArrayList<String> list= new ArrayList<>();
    list.add("apple");
    list.add("banana");
    list.add("orange");
    System.out.println(list.get(1));
    for (String fruit : list) {
        System.out.println(fruit);
    }

}
}