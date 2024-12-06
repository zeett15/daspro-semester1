import java.util.Scanner;

public class Tugas {

    static int rekrusif(int n) {
        if (n == 1) {
            return 1; 
        } else {
            return n + rekrusif(n - 1);
        }
    }

    static int iteratif(int n) {
        int total = 0;
        for (int i = 1; i <= n; i++) {
            total += i; 
        }
        return total;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan nilai N: ");
        int N = sc.nextInt();

        
        int totalRekursif = rekrusif(N);
        System.out.println("Total menggunakan rekursif: " + totalRekursif);

        int totalIteratif = iteratif(N);
        System.out.println("Total menggunakan iteratif: " + totalIteratif);
        
    }
}
