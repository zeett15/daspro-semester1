
import java.util.Scanner;

public class ArrayRataNilai22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] nilai = new int [10];
        double total = 0;
        double rata2;

        for(int i = 0; i < 10; i++){
            System.out.print("Masukan nilai mahasiswa ke-"+(i+1)+" : ");
            nilai[i] = sc.nextInt();
        }
        for(int i= 0; i < 10; i++){
            total += nilai[i];
        }
        rata2 = total/nilai.length;
        System.out.println("Rata-rata nilai = " + rata2);
        
    }
}
