package fileIO;
import java.io.IOException;
import java.io.PrintWriter;

public class PrintingToFile {

    public static void printToFile(String outputFilename) {
        int[] arr = { 4, 8, 9, 1};
        try (PrintWriter pw = new PrintWriter(outputFilename)) {
            for (int i = 0; i < arr.length; i++) {
                pw.println(arr[i]);
            }
            pw.flush();
        }
        catch(IOException e) {
            System.out.println(e);
        }
    }

    public static void main(String[] args) {
       printToFile("output.txt");
    }
}
