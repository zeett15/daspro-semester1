package jobsheet8;

import java.util.Scanner;

public class Tugas2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] olahraga = {"Badminton","Tenis Meja","Basket", "Bola Voli"};
        String[][] nama = new String [olahraga.length][2];
  
        for(int i = 0; i < olahraga.length; i++){
            System.out.println(olahraga[i]);
            System.out.println("Masukan Nama Atlit:");
            for(int j = 0; j < 2; j++){

                System.out.print(j+1 + " : ");
                nama [i][j] = sc.nextLine();

            }


            System.out.println();
        }
        System.out.println("=============================");
        System.out.println("=============================");
        
        for(int i = 0; i < olahraga.length; i++){
            System.out.println(olahraga[i]);
            for(int j = 0; j < 2; j++){
                System.out.println("- " + nama[i][j]);
            }
            System.out.println("=============================");
        }
       
    }
}
