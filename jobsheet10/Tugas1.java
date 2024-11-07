
import java.util.Scanner;

public class Tugas1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        int total = 0;
        double rata2;
        

        System.out.print("Masukan jumlah nilai yang akan di input: ");
        n = sc.nextInt();
        sc.nextLine();
        int[] nilai = new int[n];
        System.out.println();

        System.out.println("Masukan nilai mahasiswa: ");
        for(int i = 0; i < nilai.length; i++){
            
            System.out.print("nilai ke-" + (i+1)+ "(masukan nilai dengan bilangan bulat) : ");
            nilai[i] = sc.nextInt();
            total +=nilai[i];
            
        }  
        System.out.println();
        
        int nilaiTertinggi = nilai[0];
        int nilaiTerendah = nilai[0];

        for (int i = 1; i < n; i++) {
            if (nilai[i] > nilaiTertinggi) {
                nilaiTertinggi = nilai[i];
            }
            if (nilai[i] < nilaiTerendah) {
                nilaiTerendah = nilai[i];
            }
        }
        rata2 = total/n;

        System.out.println("Nilai mahasiswa: ");
        for(int i = 0; i < nilai.length; i++){
            System.out.println((i+1) + "." + nilai[i]);
        }
        System.out.println("Rata-rata nilai : " + rata2);
        System.out.println("Nilai tertinggi : " + nilaiTertinggi);
        System.out.println("Nilai terendah : " + nilaiTerendah);

    }
}
