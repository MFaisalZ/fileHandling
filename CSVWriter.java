import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class CSVWriter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String csvFile = "D:\\new_students.csv";
        String[] data = new String[3]; // Array untuk menyimpan data input pengguna

        // Meminta input dari pengguna
        for (int i = 0; i < 3; i++) {
            System.out.println("Masukkan data baris ke-" + (i + 1) + " (NIM, NAMA, UMUR):");
            data[i] = scanner.nextLine();
        }

        try (BufferedWriter bw = new BufferedWriter(new FileWriter(csvFile))) {
            for (String line : data) {
                bw.write(line);
                bw.newLine();
            }
            System.out.println("Data berhasil ditulis ke file " + csvFile);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
