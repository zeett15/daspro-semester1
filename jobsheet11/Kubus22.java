
import java.util.Scanner;

public class Kubus22 {

    public static double  hitungVolume(double sisi) {
        double volume = sisi * sisi * sisi;
        return volume;
    }
    public static double  hitungLuasPermukaan(double sisi) {
        double luasPermukaan = 6*(sisi*sisi);
        return luasPermukaan;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukan panjang sisi : ");
        double sisi = input.nextDouble();

        double volume = hitungVolume(sisi);
        double luasPermukaan = hitungLuasPermukaan(sisi);

        System.out.println("Volume Kubus : "+volume);
        System.out.println("Luas Permukaan Kubus : "+luasPermukaan);

    }
}
