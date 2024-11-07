
import java.util.Scanner;

public class Tugas3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String key ="";
        String pesanan = "";
    
        String[] menu = {"Nasi goreng", "Mie goreng", "Roti bakar", "Kentang goreng", "Teh tarik", "Cappucino", "Choocolate ice"};
        System.out.println("-----MENU-----");
        for(int i = 0; i <  menu.length; i++){
            System.out.println((i+1) + ". " + menu[i]);
        }
        System.out.println();
        System.out.print("Masukan menu yang mau di pesan: ");
        key = sc.nextLine();

        for(int i = 0; i < menu.length; i++){
            if(key.equalsIgnoreCase(menu[i])){
                pesanan = menu[i];
            }else{
                System.out.println("Pesanan tidak tersedia");
                
            }
        }
        System.out.println();
        System.out.println("Menu yang di pesan: " + pesanan);

    } 
}
