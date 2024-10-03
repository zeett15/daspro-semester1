import java.util.Scanner;
public class Pemilihan2Percobaan2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String member, jenisPembayaran="";
        int jumlah_beli, menu, harga = 0;
        double total_bayar;
        double diskon;

        System.out.println("------------------------");
        System.out.println("=====MENU KAFE JTI=====");
        System.out.println("------------------------");
        System.out.println("1. Ricebowl");
        System.out.println("2. Ice Tea");
        System.out.println("3. Paket bunding (Ricebowl + Ice Tea)");
        System.out.println("--------------------------------------");
        System.out.print("Masukan angka dari menu yang di pilih = ");
        menu = sc.nextInt();
        System.out.print("Jumlah beli = ");
        jumlah_beli = sc.nextInt();
        sc.nextLine();
        System.out.print("Apakah punya member (y/n) = ");
        member = sc.nextLine();
        System.out.println("--------------------------------------");

        if (member.equalsIgnoreCase("y")) {
            diskon = 0.1;
            System.out.println("Besar diskon = 10%");
            if (menu == 1) {
                harga = 14000;
                System.out.println("Harga = " + harga);
            }
            else if (menu == 2) {
                harga = 3000;
                System.out.println("Harga = " + harga);
            }
            else if (menu == 3){
                harga = 15000;
                System.out.println("Harga = " + harga);
            }
            else {
                System.out.println("Masukan nomer dengan benar");
            }
            total_bayar = (harga - (harga * diskon)) * jumlah_beli;

            System.out.print("Masukan jenis pembayaran (qris/cash) : ");
            jenisPembayaran = sc.nextLine();

            if (jenisPembayaran.equalsIgnoreCase("qris")) {
                total_bayar = total_bayar - 1000;  
                System.out.println("Total bayar = " + total_bayar); 
            }else if (jenisPembayaran.equalsIgnoreCase("cash")){
                System.out.println("Total bayar = " + total_bayar);
            }else {
                System.out.println("Jenis pembayaran tidak tersedia");
            }

            

        }else{
            if (menu == 1) {
                harga = 14000;
                System.out.println("Harga = " + harga);
            }
            else if (menu == 2) {
                harga = 3000;
                System.out.println("Harga = " + harga);
            }
            else if (menu == 3){
                harga = 15000;
                System.out.println("Harga = " + harga);
            }
            else {
                System.out.println("Masukan nomer dengan benar");
            }
            total_bayar = harga * jumlah_beli; 

            System.out.print("Masukan jenis pembayaran (qris/cash) : ");
            jenisPembayaran = sc.nextLine();

            if (jenisPembayaran.equalsIgnoreCase("qris")) {
                total_bayar = total_bayar - 1000;  
                System.out.println("Total bayar = " + total_bayar); 
            }else if (jenisPembayaran.equalsIgnoreCase("cash")){
                System.out.println("Total bayar = " + total_bayar);
            }else {
                System.out.println("Jenis pembayaran tidak tersedia");
            } 
        }


    }
}