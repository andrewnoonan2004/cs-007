import java.io.*;
import java.util.*;

public class Exercise1 {
    public static void main(String args[]) {
        if (args.length < 1) {
            System.out.println("\nYou must enter an input filename on cmd line!\n");
            System.exit(0);
        }

        Scanner infile = null;

        // MODIFY, REPLACE, ADD LOOP CODE, ADD TRY CATCH BLOCK(S) AS NEEDED BELOW
        boolean fileFound = false;
        do {
            try {
                infile = new Scanner(new File(args[0]));
                fileFound = true;
            } catch (FileNotFoundException fnfe) {
                System.out.println("File not found. Please enter a valid filename: ");
                Scanner scanner = new Scanner(System.in);
                args[0] = scanner.next();
            }
        } while (!fileFound);

        // THE CODE BELOW IS -AFTER, BELOW, AND OUTSIDE OF- THE ABOVE LOOP

        while (infile.hasNext()) {
            String token = infile.next(); // read a string from infile
            System.out.printf("%s\n", token);
        }

        infile.close(); // Close the Scanner to release the associated resources
    }
} // END CLASS
