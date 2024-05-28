import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileMerge {
    public static void main(String[] args) {
        String sourceFile = "D:\\source.csv";
        String destinationFile = "D:\\destination.csv";
        
        try (BufferedReader br = new BufferedReader(new FileReader(sourceFile));
             BufferedWriter bw = new BufferedWriter(new FileWriter(destinationFile))) {
            String line;
            while ((line = br.readLine()) != null) {
                bw.write(line);
                bw.newLine();
            }
            System.out.println("File berhasil disalin.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
