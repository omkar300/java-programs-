import java.util.HashMap;

public class HashMapExample {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();
        
        map.put("Apple", 3);
        map.put("Banana", 2);
        map.put("Cherry", 5);
        
        // Accessing values
        System.out.println("Banana count: " + map.get("Banana"));  // Output: 2
        
        // Iterating through the map
        for (String key : map.keySet()) {
            System.out.println(key + ": " + map.get(key));
        }
    }
}
