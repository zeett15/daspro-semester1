package jobsheet5;

import java.util.Scanner;

/**
 * PemilihanBilngan22
 */
public class PemilihanBilngan22 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int angka;

        System.out.print("Masukan Angka");
        angka = sc.nextInt();

        if (angka % 2 == 0) {
            System.out.println("Genap");
            
        }else {
            System.out.println("Ganjil");
        }
    }
}