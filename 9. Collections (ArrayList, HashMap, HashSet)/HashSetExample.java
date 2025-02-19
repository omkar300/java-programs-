import java.util.HashSet;

public class HashSetExample {
    public static void main(String[] args) {
        HashSet<String> set = new HashSet<>();
        
        set.add("Apple");
        set.add("Banana");
        set.add("Apple");  // Duplicate, won't be added
        
        // Iterating through the set
        for (String fruit : set) {
            System.out.println(fruit);
        }
    }
}