
import java.util.Scanner;

public class Percobaan2 {

    static int hitungPangkat(int x, int y){
        if(y == 0){
            return 1;
        }else{
            if (y == 1) {
                System.out.print(x + "x");
            } else {
                System.out.print(x + "x");
            }
            return (x * hitungPangkat(x, y-1));
            
        }
    }
    static int hitungPangkat1(int x, int y){
        if(y == 0){
            return 1;
        }else{
            return (x * hitungPangkat1(x, y-1));
            
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int bilangan, pangkat;
        System.out.print("Bilangan yang di hitung: ");
        bilangan = sc.nextInt();
        System.out.print("pangkat: ");
        pangkat = sc.nextInt();

        hitungPangkat(bilangan, pangkat);
        System.out.print("1 = "); 
        int hasil = (hitungPangkat1(bilangan, pangkat));
        System.out.println(hasil);

        
    }
}
