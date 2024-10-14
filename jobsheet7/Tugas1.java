import java.util.Scanner;

public class Tugas1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tiket, totalTiket= 0, harga = 50000, noPEmbeli = 1;
        double totalHarga = 0;
        char respon = 'y';
        do {
            
                System.out.println("No. Pembeli : " + noPEmbeli);
                System.out.print("Jumlah tiket : ");
                tiket = sc.nextInt();
                sc.nextLine();
                if (tiket <= 0 ) {
                    System.out.println("Input tidak valid. Masukan input yang valid");
                    continue;
                }

                totalTiket += tiket;

                if (tiket > 10) {
                    totalHarga += harga - (harga * 0.15);
                    System.out.println("total harga pembelian: " + ((harga * tiket) - (harga * 0.1)));
                }else if (tiket > 4) {
                    totalHarga += harga - (harga * 0.1);
                }else {
                    totalHarga += harga;
                    System.out.println("total harga pembelian: " + (harga * tiket));
                }
                noPEmbeli++;
            

        } while (tiket >= 0);
        System.out.println("total tiket yang terjual: " + totalTiket);
        System.out.println("total pendapatan dari tiket yang di jual: " + totalHarga);
    }
}


