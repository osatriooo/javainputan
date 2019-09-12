import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        // membuat scanner
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Input jumlah data : ");
        String dataInput = reader.readLine();
        int data = Integer.parseInt(dataInput);
        String[] nama = new String[data];
        Integer[] umur = new Integer[data];
        // mengisi data ke array
        int number = 1;
        for( int i = 0; i < data; i++ ){
            System.out.println("Silahkan input data ke - " + number ++);
            System.out.print("Nama : ");
            nama[i] = reader.readLine();
            System.out.print("Umur : ");
            umur[i] = Integer.parseInt(reader.readLine());
        }

        // menampilkan semua isi array
        System.out.println("===== Hasil =====");
        System.out.println("| Nama | Umur |");
        for(int x = 0, y = 0; x < nama.length && y < umur.length; x++, y++) {
            System.out.print("| " + nama[x] + " | ");
            System.out.println(umur[y] + " |");
        }
    }
}
