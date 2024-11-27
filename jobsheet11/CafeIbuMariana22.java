
import java.util.Scanner;

public class CafeIbuMariana22 {
    static String[]menu = {"kpoi","teh", "es degan", "Roti Bakar", "Gorengan"};
    static int [][] penjualan = new int[menu.length][7];
    static Scanner input = new Scanner(System.in);

    public static void inputPenjualan() {
        for(int i=0; i<7; i++) {
            System.out.println("Penjualan hari ke-" + (i+1));
            for(int j=0; j<menu.length; j++) {
                System.out.print((j+1) + ". " + menu[j]+": ");
                penjualan[j][i] = input.nextInt();
            }
            System.out.println();
        }
    }

    public static void tampilan() {
        System.out.println("\nData Penjualan Selama 7 Hari:");
        System.out.printf("%-15s", "Menu"); 
        for (int hari = 1; hari <= 7; hari++) {
            System.out.printf("%-10s", "Hari ke-" + hari+"   ");
        }
        System.out.println();

        for (int i = 0; i < menu.length; i++) {
            System.out.printf("%-17s", menu[i]); 
            for (int j = 0; j < 7; j++) {
                System.out.printf("%-12d", penjualan[i][j]); 
            }
            System.out.println();
        }
    }

    public static void penjualanTertinggi() {
        int tertinggi=0;
        int idx=0;
        for(int i=0; i<menu.length; i++) {
            int total=0;
            for(int j=0; j<7; j++) {
                total+=penjualan[i][j];
                if(total>tertinggi) {
                    tertinggi = total;
                    idx = i;
                }
            }
        }
        System.out.println("\nMenu yang paling laris adalah: " + menu[idx] +" dengan total penjualan : "+tertinggi);
    }

    public static void rataRata() {
        for(int i=0; i<menu.length; i++) {
            int total=0;
            for(int j=0; j<7; j++) {
                total+=penjualan[i][j];
            }
            double rata = total/7;
            System.out.printf("\nRata-rata penjualan menu "+menu[i]+" adalah: %.2f ",rata);
        }
    }
    
    public static void main(String[] args) {
        inputPenjualan();
        tampilan();
        penjualanTertinggi();
        rataRata();

    }
}
