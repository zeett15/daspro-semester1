package jobsheet3;

/**
 * Siakad22
 */
import java.util.Scanner;
public class Siakad22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String nama, nim, kelas;
        byte absen;
        double nilaiKuis, nilaiTugas, nilaiUjjian, nialiAkhir, uts;
    
        System.out.println("Masukan nama: ");
        nama = sc.nextLine();
        System.out.println("Masukan NIM: ");
        nim = sc.nextLine();
        System.out.println("Masukan kelas: ");
        kelas = sc.nextLine().toUpperCase();
        System.out.println("masukan nomer absen: ");
        absen = sc.nextByte();

        System.out.println("Masukan nilai kuis: ");
        nilaiKuis = sc.nextDouble();
        System.out.println("Masukan nilai tugas");
        nilaiTugas = sc.nextDouble();
        System.out.println("masukan nilai UTS");
        uts = sc.nextDouble();
        System.out.println("Masukan niai UAS");
        nilaiUjjian = sc.nextDouble();

        nialiAkhir = ((nilaiKuis * 0.2)+ (nilaiTugas * 0.15) + (uts * 0.3) + (nilaiUjjian * 0.35)) / 3;

        System.out.println("Nama :" + nama + " NIM: " + nim);
        System.out.println("Kelas: " + kelas + " Absen: " + absen);
        System.out.println("Nilai Akhir" + nialiAkhir);
    }
   
   

    
}