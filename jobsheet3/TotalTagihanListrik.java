package jobsheet3;
import java.util.Scanner;
public class TotalTagihanListrik {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

       int jumlahKwh;
       double hargaPerKwh = 1500, totalTagihan;

       System.out.println("Masukan jumlah kWh");
       jumlahKwh = sc.nextInt();

       totalTagihan = hargaPerKwh * jumlahKwh;
       System.out.println("total tagihan;: " + totalTagihan);

       boolean pengecekan = jumlahKwh > 500;
       System.out.println(pengecekan);
     
    }
}
