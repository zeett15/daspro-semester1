package jobsheet3;

import java.util.Scanner;
public class Kave22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        boolean keanggotaan;
        int jmlKopi, jmlTeh, jmlRoti;
        double hrgKopi = 12000.0, hrgTeh = 7000.0, hrgRoti =20000.0, totalHarga, nominalBayar;
        float diskon = 10/100F;

        System.out.println("Masukan keanggotaan (true/false): ");
        keanggotaan = sc.nextBoolean();
        System.out.println("Masukan jumlah pembelian kopi: ");
        jmlKopi = sc.nextInt();
        System.out.println("Masukan jumlah pembeli teh: ");
        jmlTeh = sc.nextInt();
        System.out.println("Msukan jumlah Pembelian roti: ");
        jmlRoti = sc.nextInt();

        totalHarga = (jmlKopi * hrgKopi) + (jmlTeh * hrgTeh) + (jmlRoti * hrgRoti);//total harga

        nominalBayar = totalHarga - (diskon * totalHarga);

        System.out.println("Keanggotaan pelanggan " + keanggotaan);
        System.out.println("Item pembelian " + jmlKopi + " kopi, " + jmlTeh +" Teh, " + jmlRoti + " Roti, ");
        System.out.println("Nominal bayar Rp " + nominalBayar);



    }
    
}
