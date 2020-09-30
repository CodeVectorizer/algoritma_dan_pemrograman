import java.util.Scanner;

/**
 *
 * @author Lukman-Afandi
 */
public class MengecekBilanganGanjilGenap_Scanner {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Inisialisasi Scanner menggunakan alias input
        Scanner input = new Scanner(System.in);
        
        // Deklarasi variable bilangan
        int bilangan;

        // Memberitahukan user untuk memasukkan sebuah bilangan
        System.out.println("Masukkan sebuah bilangan : ");
        
        // Mengambil inputan dari user
        bilangan = input.nextInt();
        
        // Melakukan pengecekan bilagan genap apa bilangan ganjil
        // lalu menampilkannya
        if(bilangan % 2 == 0)
        {            
            System.out.println("Bilangan " + bilangan + " adalah genap");
        }else{
            System.out.println("Bilangan " + bilangan + " adalah ganjil");
        }
        
        System.out.println("________________________________");
        System.out.println("Nama: Lukman Afandi");
        System.out.println("NIM: E31200844");
        System.out.println("Prodi: Manajemen Informatika");
        System.out.println("________________________________");
        
    }
    
}
