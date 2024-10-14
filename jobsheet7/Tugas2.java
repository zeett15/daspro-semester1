/**
 * Tugas2
 */
import java.util.Scanner;
public class Tugas2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int
        jenis,
        durasi,
        total = 0;

        

        do {
            System.out.println("Jenis kendaraan \n1) Mobil \n2) Motor \n0) keluar");
            System.out.print("Masukan jenis kendaraan: ");
            jenis = sc.nextInt();

            if (jenis == 1 || jenis == 2) {
                System.out.print("Durasi parkir: ");
                durasi = sc.nextInt();
                if (durasi > 5) {
                   total += 12000; 
                } else if (jenis == 1) {
                    total += 3000;
                }else if (jenis == 2) {
                    total +=2000;
                }
            }else{
               
            }
        } while (jenis == 1 || jenis == 2);
        System.out.println("============================");
        System.out.println("Total pembayaran: " + total);
    }
}