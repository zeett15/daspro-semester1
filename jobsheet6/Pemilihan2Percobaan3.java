import java.util.Scanner;

public class Pemilihan2Percobaan3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String kategori;
        double gajiBersih;
        int penghasilan = 0;
        double pajak = 0;

        System.out.print  ("Masukan kategori: ");
        kategori = sc.nextLine();
        System.out.print("Masukan penghasilan: ");
        penghasilan = sc.nextInt();

        if (kategori.equalsIgnoreCase("pekerja")) {
            if (penghasilan <= 2000000) {
                pajak = 0.1;
            }
            else if (penghasilan <= 3000000){
                pajak = 0.15;
            }
            else {
                pajak = 0.1;
            }
            
        }
        else if (kategori.equalsIgnoreCase("pembisnis")){
            if (penghasilan <= 2500000) {
                pajak = 0.15;
            }
            else if (penghasilan <= 3500000){
                pajak = 0.2;
            }
            else {
                pajak = 0.25;
            }
        }
        else {
            System.out.println("kategori salah");
        }
        System.out.println("Besar pajak = " + pajak);
        gajiBersih = penghasilan - (penghasilan * pajak);
        System.out.println("gaji bersih = " + gajiBersih);
    }
}
