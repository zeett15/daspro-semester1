
import java.util.Scanner;

public class Tugas2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        int total = 0;
        System.out.print("Mauskan jumlah pesanaan: ");
        n = sc.nextInt();
        sc.nextLine();
        System.out.println();

        String[] namaPesanan = new String[n];
        int[] harga = new int[n];

        System.out.println("Pesnana: ");
        for(int i = 0; i < n; i++){
            System.out.print( (i+1) +".");
            namaPesanan[i] = sc.nextLine();
            System.out.print("Harga: ");
            harga[i] = sc.nextInt();
            sc.nextLine();

            total += harga[i];
        }
        System.out.println();
        System.out.println("Daftar pesanan: ");
        for(int i = 0; i < n; i++){
            System.out.println((i+1)+ "." +namaPesanan[i]+ " : " + harga[i]);
            System.out.println("Total harga: " + total);
        }
        
    }
}



