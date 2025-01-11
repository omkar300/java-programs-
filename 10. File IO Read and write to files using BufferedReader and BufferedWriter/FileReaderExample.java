import java.io.*;

public class FileReaderExample {

    public static void main(String[] args) {
        try{
            BufferedReader reader = new BufferedReader(new FileReader("example.txt"));
            String line;
            while ((line=reader.readLine())!= null ) {
                System.out.println(line);
    
            }
            reader.close();
        }
        catch(IOException e)

        {
            System.out.println("An error occurred: "+ e.getMessage());

        }
        }
    }
