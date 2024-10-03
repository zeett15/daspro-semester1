import java.util.Scanner;

public class Latihan1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int bil1, bil2, bil3;
        System.out.print("bilangan 1 = ");
        bil1 = sc.nextInt();
        System.out.print("Bilangan 2 = ");
        bil2 = sc.nextInt();
        System.out.print("Bilangan 3 = ");
        bil3 = sc.nextInt();

        if (bil1 > bil2) {
            if (bil1 > bil3) {
                System.out.println("bilangan 1 = "+bil1 + " Bilangan terbesar");
            }else{
                System.out.println("bilangan 3 = " +bil3 + " Bilangan terbesar");
            }
            
        }else if(bil2 > bil3){
            System.out.println("bilangan 2 = " +bil2 + " Bilangan terbesar");    
        }else{
            System.out.println("bilangan 3 = " +bil3 + " Bilangan terbesar");
        }
    }
}
