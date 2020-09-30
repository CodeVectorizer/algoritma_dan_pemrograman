import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author Lukman-Afandi
 */
public class MenghitungLuasSegitiga_BufferedReader {
    public static void main(String[] args) throws IOException{
        // Deklarasi variable alas, tinggi dan luas
        double alas, tinggi, luas;
        
        // Inisialisasi BufferedReader dengan menggunakan alias Input 
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        
        // Memberitahukan user untuk memasukkan inputan Alas
        System.out.println("Masukkan nilai Alas :");
        
        // Mengambil inputan alas dari user dan disimpan divariable alas 
        // lalu di parsing/convert ke tipe data double
        alas = Double.parseDouble(input.readLine());
        
        // Memberitahukan user untuk memasukkan inputan Tinggi
        System.out.println("Masukkan nilai Tinggi :");
        
        // Mengambil inputan alas dari user dan disimpan divariable tinggi 
        // lalu di parsing/convert ke tipe data double
        tinggi = Double.parseDouble(input.readLine());
        
        // Melakukan operasi aritmatika menghitung luas segitiga
        // disimpan di variable luas
        luas = (alas * tinggi) / 2;
        
        // Menampilkan hasil output dari luas segitiga
        System.out.println("Luas Segitiga adalah : " + luas);                
        
        System.out.println("________________________________");
        System.out.println("Nama: Lukman Afandi");
        System.out.println("NIM: E31200844");
        System.out.println("Prodi: Manajemen Informatika");
        System.out.println("________________________________");
    }
}
