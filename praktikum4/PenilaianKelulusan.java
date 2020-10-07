// Pertama kita import dulu script dibawah ini
import java.util.Scanner;
/**
 *
 * @author CodeVector-PC
 */
public class PenilaianKelulusan {
    public static void main(String[] args){
        // kita inisialisasi scanner menggunakan alias input 
        Scanner input = new Scanner(System.in);
        
        // Memberi tahu user untuk memasukkan inputan
        System.out.println("Masukkan Nama Anda: ");
        // Mengambil inputan user dan menyimpan pada variable nama
        String nama = input.nextLine();
        // Memberi tahu user untuk memasukkan inputan
        System.out.println("Masukkan NIM : ");
        // Mengambil inputan user dan menyimpan pada variable nim
        String nim = input.nextLine();
        // Memberi tahu user untuk memasukkan inputan
        System.out.println("Masukkan Nilai : ");
        // Mengambil inputan user dan menyimpan pada variable nilai
        int nilai = input.nextInt();
        
        System.out.println("_______________________________");        
        // Melakukan pemrosesan output menggunakan operator kondisi dan operator logic
        if(nilai > 55){
            System.out.println("Selamat Anda Lulus");
        }else{
            System.out.println("Anda Tidak Lulus");
        }
    }
}
