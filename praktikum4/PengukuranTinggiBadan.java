// Pertama kita import dulu script dibawah ini
import java.util.Scanner;

/**
 *
 * @author CodeVector-PC
 */
public class PengukuranTinggiBadan {
    
   public static void main(String[] args){    
        // kita inisialisasi scanner menggunakan alias input 
        Scanner input = new Scanner(System.in);
        
        // Memberi tahu user untuk memasukkan inputan
        System.out.println("Masukkan Nama Anda: ");
        // Mengambil inputan user dan menyimpan pada variable nama
        String nama = input.nextLine();
        // Memberi tahu user untuk memasukkan inputan
        System.out.println("Masukkan Jenis Kelamin: ");
        // Mengambil inputan user dan menyimpan pada variable jenis_kelamin
        String jenis_kelamin = input.nextLine();
        // Memberi tahu user untuk memasukkan inputan
        System.out.println("Masukkan Tinggi Badan: ");
        // Mengambil inputan user dan menyimpan pada variable tinggi_badan               
        int tinggi_badan = input.nextInt();
        
        // Melakukan pemrosesan output menggunakan operator kondisi dan operator logic
        if(jenis_kelamin == "Laki-Laki"){
            if(tinggi_badan > 170 && tinggi_badan  <= 230){
                System.out.println("Selamat Anda Lulus!");          
           }else{
                System.out.println("Anda Gagal");
           }
        }else{
            if(tinggi_badan > 160 && tinggi_badan  <= 210){
                System.out.println("Selamat Anda Lulus!");          
           }else{
                System.out.println("Anda Gagal");
           }
        }
    }
}
