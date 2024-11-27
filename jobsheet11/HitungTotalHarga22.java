
import java.util.Scanner;

public class HitungTotalHarga22 {
    public static  int hitungTotalHarga(int pilihMenu, int banyakItem){
        int [] hargaItems = {15000, 20000, 22000, 12000, 10000, 18000};

        int hargaTotal = hargaItems[pilihMenu - 1] * banyakItem;

        return hargaTotal;
    }
    public static double  diskon(String kodePromo){
        double diskon = 1.0;
        if(kodePromo.equalsIgnoreCase("DISKON50")){
            diskon = 0.5;
        }else if(kodePromo.equalsIgnoreCase("DISKON30")){
            diskon = 0.7;
        }else if(!kodePromo.isEmpty()){
            System.out.println("Kode promo tidak valid");
        }

        return diskon;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int totalHargaKeseluruhan=0;
        double diskon;
        int totalAkhir;
        int pilihMenu, banyakItem;
        int totalHraga;
        String kodePromo;
        //input pesanan
        while (true) {
            System.out.print("Masukan nomer menu yang ingin anda pesan (1-6) atau 0 untuk keluar: ");
            pilihMenu = input.nextInt();
            if(pilihMenu==0){
                break;
            }
            System.out.print("Masukan banyak item yang ingin anda pesan\t\t\t  : ");
            banyakItem = input.nextInt();
            System.out.println();

            //hitung harga total
            totalHraga = hitungTotalHarga(pilihMenu, banyakItem);
            totalHargaKeseluruhan+=totalHraga;
        }

        //input diskon dan hitung total akhir
        input.nextLine();
        System.out.print("\nMasukan kode promo(sikp juka tidak punya)\t\t\t  : ");
        kodePromo = input.nextLine();

        diskon = diskon(kodePromo);
        totalAkhir = (int) (totalHargaKeseluruhan * diskon);

        System.out.println("Total harga untuk pesanan anda \t\t\t\t\t: Rp." + totalAkhir);
    }
}
