public class LinearSearch {
    public static void main(String[] args) {
        int[] arr = {5, 10, 15, 20, 25};
        int target = 15;
        int result = linearSearch(arr, target);
        
        if (result == -1) {
            System.out.println("Element not found.");
        } else {
            System.out.println("Element found at index: " + result);
        }
    }
    
    public static int linearSearch(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i;  // Return the index of the target
            }
        }
        return -1;  // Target not found
    }
}
