import java.util.Scanner;

/**
 * SiakadFor22
 */
public class SiakadFor22 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double nilai, tertinggi = 0, terendah = 100;
        int lulus =1, tidakLulus = 1;

        for (int i =1;i <= 10; i++){
            System.out.print("Masukan  nilai mahasiswa ke-" + i + ": ");
            nilai = sc.nextDouble();

            if (nilai > tertinggi) {
                tertinggi = nilai;
            }
            if (nilai < terendah) {
                terendah = nilai;
            }
            if (nilai >= 60) {
                lulus++;
            }else{
                tidakLulus++;
            }
        }
        System.out.println("===============================");
        System.out.println("Nilai tertinggi: " + tertinggi);
        System.out.println("Nilai terendah: " + terendah);
        System.out.println("lulus: " + lulus + " orang");
        System.out.println("tidak lulus: " + tidakLulus + " orang");
    }
}