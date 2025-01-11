import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.classfile.BufWriter;

public class FileWriterExample {
    public static void main(String[] args) {
        try{
            BufferedWriter writer = new BufferedWriter(new FileWriter("example.txt"));
            writer.write("Hello, this is a test!");
            writer.newLine();  // Adds a new line
            writer.write("Writing to file using BufferedWriter.");
            writer.close();
            
        }
        catch (IOException e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }
}
