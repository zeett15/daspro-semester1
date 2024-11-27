
import java.util.Scanner;

public class Percobaan6Fungsi {
    public static int hitungLuas (int panjang, int lebar) {
        int luas = panjang * lebar;
        return luas;
    }
    public static int hitngVolume(int panjang, int lebar, int tinggi) {
        int volume = panjang*lebar*tinggi;
        return volume;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int p,l,L,t,vol;
        
        System.out.println("Masukan panjang");
        p = input.nextInt();
        System.out.println("Masukan lebar");
        l = input.nextInt();
        System.out.println("Masukan tinggi");
        t = input.nextInt();
        
        L=hitungLuas(p,l);
        System.out.println("Luas Persegi panjang adalah:" + L);

        vol=hitngVolume(p, L, t);
        System.out.println("Volume balok adalah:" + vol);
    }
}
