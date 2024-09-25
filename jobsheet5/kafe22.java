package jobsheet5;

import java.util.Scanner;

public class kafe22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        boolean keanggotaan;
        String menu;
        char ukuranCup;
        int jumlah;
        double diskon, nominalBayar, totalHarga;

        
        System.out.print("Menu : ");
        menu = sc.nextLine();
        System.out.print("Ukuran cup : ");
        ukuranCup = sc.next().charAt(0);
        System.out.print("jumlah : ");
        jumlah = sc.nextInt();
        System.out.print("keanggotaan : ");
        keanggotaan = sc.nextBoolean();

        double hargaMenu = 0;

        switch (menu.toLowerCase()) {
            case "kopi":
                hargaMenu = 12000;
                break;
            case "teh":
                hargaMenu = 7000;
                break;
            case "coklat":
                hargaMenu =20000;
                break;
        
            default:
                System.out.println("Menu tidak tersedia");
                break;
        }
        totalHarga = hargaMenu * jumlah;

        switch (ukuranCup) {
            case 'm':
                totalHarga = totalHarga + (hargaMenu * 0.25);  
                break;
            case 'l':
                totalHarga = totalHarga + (hargaMenu * 0.4);
            case 's':
                break;
            default:
                System.out.println("Ukuran tidak tersedia");
                break;
        }
        diskon = (keanggotaan) ? 0 : 0.1;
        nominalBayar = totalHarga - (totalHarga * diskon);
        System.out.println("=============================");
        System.out.println("Nominal Bayar : " + nominalBayar * jumlah);

    }
}
