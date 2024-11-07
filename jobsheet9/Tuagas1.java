
import java.util.Scanner;

public class Tuagas1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 9;

        

        for(int i = 1; i<=n; i++){
            for(int j = 1; j <= n; j++){
                if(i == 1 || i == n || j == n || j == 1 || j==n/2 + 1 || i == n/2 + 1 || i + 1== j + 1 || i == n - j + 1)
                System.out.print(n + "\t");
                else
                System.out.print(" \t");
            }
            System.out.println(" \n");
        }
    }
}
