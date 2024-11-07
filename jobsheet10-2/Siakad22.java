import java.util.Scanner;

public class Siakad22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a,b;
        
        System.out.print("Masukan jumlah mahasiswa: ");
        a = sc.nextInt();
        System.out.print("Masukan jumlah mata kuliah: ");
        b = sc.nextInt();

        int[][] nilai = new int[a][b];

        for(int i=0; i<nilai.length; i++){
            System.out.println("input nilai mahasiswa ke-" + (i+1));
            double totalPerSiswa = 0;
            for(int j=0; j<nilai[i].length; j++){
                System.out.print("Nilai mata kuliah ke-" + (i+1));
                nilai[i][j] = sc.nextInt();
                sc.nextLine();
                totalPerSiswa +=nilai[i][j];
            }
            System.out.println("Nilai rata-rata: " + totalPerSiswa/nilai[i].length);
            System.out.println();
        }
        System.out.println("===========================");
        System.out.println("Total rata-rata nilai mahasiswa per matkul");

        for(int j=0; j<nilai[0].length; j++){
            double totalPerMatkul = 0;
            for(int i = 0; i<nilai.length; i++){
                totalPerMatkul += nilai[i][j];
                
            }
            System.out.println("mata kuliah " + (j+1) + ": " + totalPerMatkul/nilai.length);
        }
    }
}
