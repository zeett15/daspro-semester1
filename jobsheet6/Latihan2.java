import java.util.Scanner;

public class Latihan2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

             double diskon = 0;
             int jumlahhBuku;
             String jenisBuku;

             System.out.print("Masukan jenis buku = ");
             jenisBuku = sc.nextLine();
             System.out.print("Jumlah buku = ");
             jumlahhBuku = sc.nextInt();

             if (jenisBuku.equalsIgnoreCase("kamus")) {
                diskon = 0.1;
                if (jumlahhBuku > 2) {
                   diskon += 0.02;  
                }else{
                    diskon += 0;
                }
                
             }
             else if (jenisBuku.equalsIgnoreCase("novel")) {
                diskon = 0.07;
                if (jumlahhBuku > 3) {
                    diskon += 0.02;
                }else {
                    diskon += 0.01;
                }
                
             }
             else {
                if (jumlahhBuku > 3) {
                    diskon = 0.05;    
                }
             } 
             String hasil = String.format("jumlah diskon %.2f", diskon);
             System.out.println(hasil);
    }        
}
