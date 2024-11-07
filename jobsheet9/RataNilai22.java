

import java.util.Scanner;

public class RataNilai22 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int i = 1;
        float nilai, totalNilai, rataNilai;

        while (i<=2) {
            System.out.println("input nilai mahasiswa ke-" + i + " :");
            totalNilai = 0;
            for (int j = 1; j<=5; j++){
                System.out.print("nilai yang ke-" + j + " = ");
                nilai = sc.nextInt();
                totalNilai += nilai;
            }
            rataNilai = totalNilai/5;
            System.out.println("rata-rata nilai mahasiswa ke- " + i + " = " + rataNilai);
            System.out.println("================================================");
            i++;
        }
    }

    
}
