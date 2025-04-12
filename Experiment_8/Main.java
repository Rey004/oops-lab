package Experiment_8;
import java.io.*;

public class Main {
    public static void main(String[] args) {
        try {
    
            FileWriter writer = new FileWriter("output.txt");
            writer.write("Hello from Java File Handling!");
            writer.close();
            System.out.println("Successfully written to file.");

            FileReader reader = new FileReader("output.txt");
            int ch;
            System.out.print("File content: ");
            while ((ch = reader.read()) != -1) {
                System.out.print((char) ch);
            }
            reader.close();
        } catch (IOException e) {
            System.out.println("An error occurred.");
        }
    }
}
