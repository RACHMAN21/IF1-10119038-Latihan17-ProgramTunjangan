package if1.latihan17.programtunjangan;

/**
 *
 * @author
 * NAMA  : Rachman Aldiansyah
 * KElAS : IF-1
 * NIM   : 10119038
 * Deskripsi Program : Program untuk menentukan tunjangan seorang pegawai
 * 
 */

import java.util.Scanner; // import kelas java

public class ProgramTunjangan {
    
    public static void main(String[] args) {
        // deklarasi variabel
        String status;
        double tunjangan, gajiTotal;
        int gajiPokok;
        
        // membuat scanner baru
        Scanner scanner = new Scanner(System.in);
        
        // tampilkan output ke layar
        System.out.println("=========Program Tunjangan=========");
        
        System.out.print("Berapa gaji pokok anda perbulan? : Rp.");
        // user memasukkan harga gajiPokok seorang pegawai
        gajiPokok = scanner.nextInt();
        
        System.out.print("Status Anda? (Menikah/Belum) :");
        // user memasukkan status seorang pegawai
        status = scanner.nextLine();
        
        // operasi logika untuk menentukan status seorang pegawai
        if(status == "Menikah") {
            
            tunjangan = (3.5 * gajiPokok);
            gajiTotal = (gajiPokok * tunjangan);
            // output hasil dari data yang dimasukkan user
            System.out.println("=========Hasil Perhitungan Gaji Anda=========");
            System.out.println("Gaji Pokok\t : " + gajiPokok);
            System.out.println("Tunjangan\t  : " + tunjangan);
            System.out.println("Total Gaji\t : " + gajiTotal);
        
        } else if(status == "Belum") {
            
            tunjangan = (0);
            gajiTotal = (gajiPokok * tunjangan);
            // output hasil dari data yang dimasukkan user
            System.out.println("=========Hasil Perhitungan Gaji Anda=========");
            System.out.println("Gaji Pokok\t : " + gajiPokok);
            System.out.println("Tunjangan\t  : " + tunjangan);
            System.out.println("Total Gaji\t : " + gajiTotal);
        
        } else {
            
            System.out.println("Silahkan Masukkan Data Yang Benar!");
        
        }
    }
}