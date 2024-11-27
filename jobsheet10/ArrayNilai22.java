
import java.util.Scanner;

public class ArrayNilai22 {
    public static void main(String[] args) {
        int[] nilaAkhit = new int[10];
        Scanner sc = new Scanner(System.in);
        for(int i= 0; i < nilaAkhit.length; i++){
            System.out.print("Masukan nilai akhit ke-"+ (i+1) +" : ");
            nilaAkhit[i] = sc.nextInt();
        }
        System.out.println();
        for(int i = 0; i < 10; i++){
            if (nilaAkhit [i] > 70) {
                System.out.println("Nilai akhir ke-"+ (i+1)+ " lulus ");
            }else{
                System.out.println("Nilai akhir ke-"+ (i+1)+ " tidak lulus ");
            }
        }
    }
}
