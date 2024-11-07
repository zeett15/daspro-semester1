
import java.util.Scanner;
public class Square22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n;
        System.out.print("Masukan Nilai N: ");
        n = sc.nextInt();

        for (int iOuter =1; iOuter<=n;iOuter++){
            for(int i = 0; i <= n; i++){
                System.out.print("*");
            }
            System.out.println("");
        }
        
    }
}
