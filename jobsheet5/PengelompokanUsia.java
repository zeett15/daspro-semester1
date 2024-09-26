package jobsheet5;
import java.util.Scanner;
public class PengelompokanUsia {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        float usia;

        System.out.print("Masukan usia: ");
        usia = sc.nextInt();

        if (usia >= 0) {
            if (usia >= 0 && usia <= 12) {
                System.out.println("Usia " + usia + " adalah kategori usia anak-anak");
                
            }
            else if (usia > 12 && usia <= 19){
                System.out.println("Usia " + usia + " adalah kategori usia remaja");
            }
            else if (usia > 20 && usia <= 64){
                System.out.println("Usia " + usia + " adalah kategori usia dewasa");
            }
            else {
                System.out.println("Usia " + usia + " adalah kategori usia lansia");
            }
        }
        else {
            System.out.println("Usia tidak valid");
        }
    }
}
