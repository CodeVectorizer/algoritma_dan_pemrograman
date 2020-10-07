package latihan;

// Pertama kita import dulu script dibawah ini
import java.util.Scanner;

/**
 *
 * @author CodeVector-PC
 */
public class NilaiHuruf {
    public static void main(String[] args){
        // kita inisialisasi scanner menggunakan alias input 
        Scanner input = new Scanner(System.in);        
        
        // Memberi tahu user untuk memasukkan inputan
        System.out.println("Masukkan Nilai: ");
        // Mengambil inputan user dan menyimpan pada variable nilai
        int nilai = input.nextInt();
        
        // Melakukan pemrosesan output menggunakan operator kondisi dan operator logic
        if(nilai >= 0 && nilai <= 55){
            System.out.println("E");
        }else if(nilai >= 56a && nilai <= 65){
            System.out.println("D");
        }else if(nilai >= 66 && nilai <= 75){
            System.out.println("C");
        }else if(nilai >= 76 && nilai <= 85){
            System.out.println("B");
        }else if(nilai >= 86 && nilai <= 100){
            System.out.println("A");
        }else{
            System.out.println("Error");
        }
        
    }
}
