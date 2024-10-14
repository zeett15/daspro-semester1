import java.util.Scanner;

public class KafeDoWhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int kopi, teh, roti, jmlKopi, jumTeh, jumRoti, totalHarga;
        String menu ="";
        kopi = 12000;
        teh = 7000;
        roti = 20000;

        do {
            System.out.print("Masukan nama pelnggan (ketik 'batal' jika ingin membataklan transaksi: ");
            menu = sc.nextLine();
            if (menu.equalsIgnoreCase("batal")) {
                System.out.println("transaksi batal");
                break;
            }

            System.out.println("jumlah kopi: ");
            jmlKopi = sc.nextInt();
            totalHarga = jmlKopi* kopi; 
            System.out.println("jumlah teh: ");
            jumTeh = sc.nextInt();
            totalHarga += (jmlKopi* teh);
            System.out.println("jumlah roti");
            jumRoti = sc.nextInt();
            totalHarga += (jmlKopi* roti);

            System.out.println("Total yang harus di bayar: Rp." + totalHarga);
            sc.nextLine();
            
        } while (true);
        System.out.println("Transaksi selesai");


    }
}
