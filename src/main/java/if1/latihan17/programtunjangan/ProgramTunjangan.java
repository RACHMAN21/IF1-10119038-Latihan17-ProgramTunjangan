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
        double tunjangan;
        double gajiPokok, gajiTotal;
        
        // tampilkan output ke layar
        System.out.println("=========Program Tunjangan=========");
        // user memasukkan harga gajiPokok seorang pegawai;
        System.out.print("Berapa gaji pokok anda perbulan? : Rp.");
        Scanner sc_1 = new Scanner(System.in);
        gajiPokok = sc_1.nextInt();
        // user memasukkan status seorang pegawai
        System.out.print("Status Anda? (Menikah/Belum)     : ");
        Scanner sc_2 = new Scanner(System.in);
        status = sc_2.nextLine();
        
        // operasi logika untuk menentukan status seorang pegawai
        switch(status) {
            case "Menikah" : 
                tunjangan = (0.35 * gajiPokok);
                gajiTotal = (gajiPokok + tunjangan);
                // output hasil dari data yang dimasukkan user
                System.out.println("=========Hasil Perhitungan Gaji Anda=========");
                System.out.println("Gaji Pokok : Rp." + gajiPokok);
                System.out.println("Tunjangan  : Rp." + tunjangan);
                System.out.println("Total Gaji : Rp." + gajiTotal);
                System.out.println("(Developed by : Rachman Aldiansyah)");
                break;
            case "Belum" :
                tunjangan = (0);
                gajiTotal = (gajiPokok + tunjangan);
                // output hasil dari data yang dimasukkan user
                System.out.println("=========Hasil Perhitungan Gaji Anda=========");
                System.out.println("Gaji Pokok : Rp." + gajiPokok);
                System.out.println("Tunjangan  : Rp." + tunjangan);
                System.out.println("Total Gaji : Rp." + gajiTotal);
                System.out.println("(Developed by : Rachman Aldiansyah)");
                break;
            default:
                System.out.println("Isi Data Yang Benar!!");
        }
    }
}