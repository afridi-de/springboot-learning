import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FIleIO {
    
    public static void main(String[] args) {

        // Your code here
        String[] names = {"Alice", "Bob", "Charlie", "David", "Eve"};

        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter("/home/afridi/learn/java_basics/output_files/output.txt"));
            writer.write("Hello, World!");
            writer.write("\nAnother line of text.");

            for (String name : names) {
                writer.write("\n" + name);
            }

            writer.close();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        try {
            BufferedReader reader = new BufferedReader(new FileReader("/home/afridi/learn/java_basics/output_files/output.txt"));

            String line;

            while((line = reader.readLine()) != null){
                System.out.println(line);
            }

            System.out.println("Reading from the file:");
            System.out.println(reader.readLine()); // Read and print the first line
            reader.close();

        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        
    }
}
