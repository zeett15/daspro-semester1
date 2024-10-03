import java.util.Scanner;

public class Latihan3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String merek, katagori;
        int  harga, ukuran;
        
        System.out.print("Merek sepatu = ");
        merek = sc.nextLine().toLowerCase();
        System.out.print("kategori sepatu = ");
        katagori = sc.nextLine().toLowerCase();
        System.out.print("Ukuran sepatu = ");
        ukuran = sc.nextInt();

        if (merek.equalsIgnoreCase("convers")) {
            if (katagori.equalsIgnoreCase("slip on")) {
                if (ukuran >= 36) {
                    if (ukuran <= 40) {
                        harga = 800000; 
                        System.out.println("Harga sepatu = " + harga);
                        
                    }else{
                        System.out.println("Ukuran tidak tersedia");
                    }
                    
                }else{
                    System.out.println("Ukuran tidak tersedia"); 
                }
                
            }
            else if (katagori.equalsIgnoreCase("hight top")) {
                if (ukuran >= 40) {
                   if (ukuran <= 44) {
                    harga = 1200000;
                    System.out.println("Harga sepatu = " + harga);
                   } else {
                    System.out.println("UKuran sepatu tidak tersedia");
                   }
                }else{
                    System.out.println("Ukuran sepatu tidak tersedia");
                }
            }
        }
        else if (merek.equalsIgnoreCase("sketcher")) {
            if (katagori.equalsIgnoreCase("woman")) {
                if (ukuran >= 36) {
                    if (ukuran <= 41) {
                        harga = 1000000; 
                        System.out.println("Harga sepatu = " + harga);
                        
                    }else{
                        System.out.println("Ukuran tidak tersedia");
                    }
                    
                }else{
                    System.out.println("Ukuran tidak tersedia"); 
                }
            }
            else if (katagori.equalsIgnoreCase("man")) {
                if (ukuran >= 41) {
                    if (ukuran <= 44) {
                        harga = 1800000; 
                        System.out.println("Harga sepatu = " + harga);
                        
                    }else{
                        System.out.println("Ukuran tidak tersedia");
                    }
                    
                }else{
                    System.out.println("Ukuran tidak tersedia"); 
                }
            }
        }
        else if (merek.equalsIgnoreCase("nike")) {
            if (katagori.equalsIgnoreCase("kids")) {
                if (ukuran >= 36) {
                    if (ukuran <= 40) {
                        harga = 750000; 
                        System.out.println("Harga sepatu = " + harga);
                        
                    }else{
                        System.out.println("Ukuran tidak tersedia");
                    }
                    
                }else{
                    System.out.println("Ukuran tidak tersedia"); 
                }
            }
            if (katagori.equalsIgnoreCase("adult")) {
                if (ukuran >= 40) {
                    if (ukuran <= 44) {
                        harga = 1500000; 
                        System.out.println("Harga sepatu = " + harga);
                        
                    }else{
                        System.out.println("Ukuran tidak tersedia");
                    }
                    
                }else{
                    System.out.println("Ukuran tidak tersedia"); 
                }
            }
        }
        else {
            System.out.println("Merek sepatu tidak tersedia");
        }

    }
}
