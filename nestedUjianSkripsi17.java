import java.util.Scanner;
public class nestedUjianSkripsi17 {
    
    /**
     * @param args
     */
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        String pesan;
        System.out.println("Apakah mahasiswa sudah bebas kompen? (Ya/Tidak)");
        // fungsi trim() berfungsi untuk menghapus spasi sebelum dan setelah string
        String bebasKompen = sc.nextLine().trim();

        System.out.println("Masukkan jumlah log bimbingan Pembimbing 1: ");
        int bimbinganP1 = sc.nextInt();
        System.out.println("Masukkan jumlah log bimbingan Pembimbing 2: ");
        int bimbinganP2 = sc.nextInt();

        //equalsIgnoreCase() membandingkan dua variabel tanpa membedakan huruf besar/kecil.
        if (bebasKompen.equalsIgnoreCase("Ya")) {
            //&& kedua syarat harus terpenuhi.
            if(bimbinganP1 >= 8 && bimbinganP2 >= 4) {
                pesan = "Semua syarat terpenuhi. Mahasiswa boleh mendaftar ujian skripsi";
            } else if (bimbinganP1 < 8 && bimbinganP2 < 4) {
                pesan = "Gagal! Log bimbingan P1 kurang dari 8 kali dan P2 kurang dari 4 kali";
            } else if (bimbinganP1 < 8) {
                pesan = "Gagal! Log bimbingan P1 belum mencapai 8 kali";
            } else {
                pesan = "Gagal! Log bimbingan P2 belum mencapai 4 kali";
            }
        } else {
            pesan = "Gagal! Mahasiswa masih memiliki tanggungan kompen";
        }
        System.out.println(pesan);


    }
}
