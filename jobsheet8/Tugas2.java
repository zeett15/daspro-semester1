package jobsheet8;

import java.util.Scanner;

public class Tugas2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] olahraga = {"Badminton","Tenis Meja","Basket", "Bola Voli"};

        System.out.print("Masukan jumlah politeknik yang mendaftar: ");
        int n = sc.nextInt();
        sc.nextLine();
        String[] politeknik = new String[n];

        System.out.println("Masukan nama politeknik yang berpartisipasi: ");
        for(int i = 0; i < n; i++){
            
            System.out.print(i+1 + ".");
            politeknik[i] = sc.nextLine();
        }
        
        System.out.println("======================");
        System.out.println();

        String[][][] nama = new String [politeknik.length][olahraga.length][2];

        for(int h = 0; h < politeknik.length; h++){
            System.out.println(politeknik[h]+ ":");
            for(int i = 0; i < olahraga.length; i++){
                System.out.println("-" + olahraga[i]);
                System.out.println("Masukan Nama Atlit:");
                for(int j = 0; j < 2; j++){
    
                    System.out.print(j+1 + " : ");
                    nama [h][i][j] = sc.nextLine();
    
                }
                System.out.println();
            }

        }
        
        System.out.println("=============================");
        System.out.println("=============================");

        for(int h = 0; h < politeknik.length; h++){
            System.out.println(politeknik[h]+ ":");
            for(int i = 0; i < olahraga.length; i++){
                System.out.println("- " + olahraga[i]);
                for(int j = 0; j < 2; j++){
                    System.out.println(j+1 + nama[h][i][j]);
                }
                System.out.println("=============================");
            }

        }
        
       
    }
}
