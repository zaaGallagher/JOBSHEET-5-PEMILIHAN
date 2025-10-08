import java.util.Scanner;
public class cetakKRS17 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("--- Cetak KRS Siakad ---");
        System.out.println("Apakah ukt sudah lunas? (true/false): ");
        boolean uktLunas = sc.nextBoolean();

        // if (uktLunas) {
        //     System.out.println("Pembayaran UKT Terferivikasi");
        //     System.out.println(" Silahkan cetak KRS dan minta ttd DPA");
        // } else{  
        //  System.out.println("Regulasi ditolak slahkan lunasi UKT terlebih dahulu");
        //}
        System.out.println(uktLunas ? "Pembayaran UKT terferivikasi\nsilahkan cetak KRS dan minta ttd DPA" : "Regulasi ditolak slahkan lunasi UKT terlebih dahulu");
    }
    
}