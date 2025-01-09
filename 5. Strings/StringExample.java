package Strings;

public class StringExample {
    public static void main(String[] args) {
        String str = "Hello, World!";
        System.out.println("Length: " + str.length());
        System.out.println("Character at index 7: " + str.charAt(7));
        System.out.println("Substring: " + str.substring(7, 12));
        System.out.println("Uppercase: " + str.toUpperCase());
        System.out.println("Replaced: " + str.replace("World", "Java"));
    }
}
