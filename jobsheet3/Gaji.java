package jobsheet3;
import java.util.Scanner;
public class Gaji {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int jumlahJam, upahPerJam,  totalGaaji;
        double bonusGaji = 0.1, potongPajak = 0.05, gajiKotor, gajiBersih;
        
        System.out.println("jumlah jam");
        jumlahJam = sc.nextInt();
        System.out.println("Upah per jam");
        upahPerJam = sc.nextInt();

        totalGaaji = upahPerJam * jumlahJam;
        gajiKotor = totalGaaji * bonusGaji;
        gajiBersih = gajiKotor * potongPajak;

        System.out.println("hasil gaji: " + totalGaaji);

        

        

    }
}
