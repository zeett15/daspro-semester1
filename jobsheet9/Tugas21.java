

import java.util.Scanner;

public class Tugas21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int politeknik;
        String atlitBadminton ="";
        String atlitTenisMeja="";
        String atlitBasket="";
        String atlitBolaVoli="";

        System.out.print("Masukan jumlah politeknik yang berpartisipasi: ");
        politeknik = sc.nextInt();
        sc.nextLine();

        for(int i = 0; i < politeknik; i++){
            System.out.println("-----------Badiminton----------");
            System.out.println("Masukan nama peserta:");
            for(int j = 1; j <= 5; j++){
                System.out.print(j + ".");
                atlitBadminton = sc.nextLine();
            }
            System.out.println("-----------Tenis Meja----------");
            System.out.println("Masukan nama peserta:");
            for(int k = 1; k <= 5; k++){
                
                System.out.print(k + ".");
                atlitTenisMeja = sc.nextLine();
            }
            System.out.println("-----------Basket----------");
            System.out.println("Masukan nama peserta:");
            for(int l = 1; l <= 5; l++){
                
                System.out.print(l + ".");
                atlitBasket = sc.nextLine();
            }
            System.out.println("-----------Bola Voli----------");
            System.out.println("Masukan nama peserta:");
            for(int h = 1; h <= 5; h++){
                
                System.out.print(h + ".");
                atlitBolaVoli = sc.nextLine();
            }

        }
        
        // System.out.println();
        // System.out.println("Data nama atlet yang terdaftar");
        // System.out.println("atlet badminton : \n"+ atlitBadminton + "\n");
        // System.out.println("atlet tenis meja: \n"+atlitTenisMeja+ "\n");
        // System.out.println("atlet basket: \n" + atlitBasket+"\n");
        // System.out.println("atlet voly: \n" + atlitBolaVoli+"\n");


    }
}
