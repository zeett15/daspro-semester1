
import java.util.Scanner;

public class ArrayRataNilai22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double total = 0;
        double rata2;
        int lulus =0;
        int tidakLulus = 0;
        int jmlMahasiswa;
        int n;

        System.out.print("Masukan jumlah nilai yang akan di input: ");
        n = sc.nextInt();

        int[] nilai = new int [n];
        

        System.out.print("Masukan jumlah mahasiswa: ");
        jmlMahasiswa = sc.nextInt();
        sc.nextLine();

        for(int h = 0; h< jmlMahasiswa; h++){
            
            for(int i = 0; i < 10; i++){
                System.out.print("Masukan nilai mahasiswa ke-"+(i+1)+" : ");
                nilai[i] = sc.nextInt();
            }
            for(int i= 0; i < 10; i++){
                total += nilai[i];
            }
            rata2 = total/nilai.length;
            System.out.println("Rata-rata nilai = " + rata2);

            if (rata2 > 70) {
                lulus += 1;
            }else{
                tidakLulus += 1;
            }
        }
        System.out.println("Jumlah mahasiswa yang lulus: " + lulus);
        System.out.println("Jumlah mahasiswa yang tidak lulus: " + tidakLulus);
        
      
    }
}
