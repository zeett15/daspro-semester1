package jobsheet5;

/**
 * Siakad22
 */
import java.util.Scanner;

public class Siakad22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String nama, nim, kelas;
        byte absen;
        double nilaiKuis, nilaiTugas, nilaiUjjian, nilaiAkhir, uts;

        System.out.println("Masukan nama: ");
        nama = sc.nextLine();
        System.out.println("Masukan NIM: ");
        nim = sc.nextLine();
        System.out.println("Masukan kelas: ");
        kelas = sc.nextLine().toUpperCase();
        System.out.println("Masukan nomer absen: ");
        absen = sc.nextByte();

        System.out.println("Masukan nilai kuis: ");
        nilaiKuis = sc.nextDouble();
        System.out.println("Masukan nilai tugas");
        nilaiTugas = sc.nextDouble();
        System.out.println("Masukan nilai UTS");
        uts = sc.nextDouble();
        System.out.println("Masukan nilai UAS");
        nilaiUjjian = sc.nextDouble();

        
        nilaiAkhir = ((nilaiKuis * 0.2) + (nilaiTugas * 0.15) + (uts * 0.3) + (nilaiUjjian * 0.35)) / 3;

        
        String nilaiHuruf = "";
        float ipk = 0f;
        String kualifikasi ="";

        
        if (nilaiAkhir >= 80 && nilaiAkhir <= 100) {
            nilaiHuruf = "A";
            ipk = 4;
            kualifikasi = "Sangat Baik";
        } else if (nilaiAkhir >= 73 && nilaiAkhir < 80) {
            nilaiHuruf = "B+";
            ipk = 3.5f;
            kualifikasi = "Lebih dari Baik";
        } else if (nilaiAkhir >= 65 && nilaiAkhir < 73) {
            nilaiHuruf = "B";
            ipk = 3;
            kualifikasi = "Baik";
        } else if (nilaiAkhir >= 60 && nilaiAkhir < 65) {
            nilaiHuruf = "C+";
            ipk = 2.5f;
            kualifikasi = "Lebih dari Cukup";
        } else if (nilaiAkhir >= 50 && nilaiAkhir < 60) {
            nilaiHuruf = "C";
            ipk = 2;
            kualifikasi = "Cukup";
        } else if (nilaiAkhir >= 39 && nilaiAkhir < 50) {
            nilaiHuruf = "D";
            ipk = 1;
            kualifikasi = "Kurang";
        } else if (nilaiAkhir <= 39) {
            nilaiHuruf = "E";
            ipk = 0;
            kualifikasi = "Gagal";
        }

        System.out.println("Nama: " + nama + " NIM: " + nim);
        System.out.println("Kelas: " + kelas + " Absen: " + absen);
        System.out.println("Nilai Akhir: " + nilaiAkhir);
        System.out.println("Nilai Huruf: " + nilaiHuruf);
        System.out.println("IPK: " + ipk);
        System.out.println("Kualifikasi: " + kualifikasi);
    }
}
