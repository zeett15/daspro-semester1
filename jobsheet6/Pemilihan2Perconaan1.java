import java.util.Scanner;

/**
 * Pemilihan2Perconaan1
 */
public class Pemilihan2Perconaan1 {

   public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int tahun;
    System.out.print("Masukan Tahun: ");
    tahun = sc.nextInt();

    if ((tahun % 4) == 0) {
        if ((tahun % 100) != 0) {
            if ((tahun % 400) == 0) {
                System.out.println("Tahun kabisat");
                
            }else {
                System.out.println("Bukan tahun kabisat");
            }
            
        }else {
            System.out.println("bukan tahun kabisat");
        }
        
    }else {
        System.out.println("Bukan tahun kabisat");
    }

   }
}