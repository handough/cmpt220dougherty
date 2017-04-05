import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;
public class RemoveText{
    public static void main(String[] args) {
        if (args.length != 2) {
            System.out.println("Invalid arguments.");
            System.out.println("Usage: java Exercise12_11 John filename");
            System.exit(1);
        }
        // Check if the filename exist
        File filename = new File(args[1]);
        if (!filename.exists()) {
            System.out.println(args[1] + " does not exist.");
            System.out.println(2);
        }
        // create input and output files
        String s = "";
        try {
            Scanner input = new Scanner(filename);
            while (input.hasNext()) {
                s += input.nextLine();
            }
            input.close();
        } 
        catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        s = s.replaceAll(args[0], "");
        
        try {
            PrintWriter output = new PrintWriter(filename);
            System.out.println(s);
            output.write(s);
            output.close();
        } 
        catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        System.out.println("Complete");
    }
}
