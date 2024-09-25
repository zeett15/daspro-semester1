package jobsheet5;

import java.util.Scanner;

/**
 * PemilihanBilngan22
 */
public class PemilihanBilngan22tp {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int angka;


        System.out.print("Masukan Angka");
        angka = sc.nextInt();

    String hasil = (angka % 2 == 0) ? "genap" : "ganjil";
    System.out.println(hasil);
    }
}