import java.util.Scanner;

public class SiakadWhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int i = 1, jml, nilai = 0;

        System.out.print("Masukan jumlah mahasiswa: ");
        jml = sc.nextInt();
        
        while (i <= jml) {
            System.out.print("Masukan nilai mahasiswa " + i + " : ");
            nilai = sc.nextInt();
            if (nilai <0 || nilai > 100) {
                System.out.println("nilai idak valid. masukan ulang nilai");continue;
            }
            if (nilai > 80 && nilai <= 100){
                System.out.println("Nilai mahasiswa " + i + " adalah A");
                System.out.println("Bagus,pertahankan nilainya");
            }else if (nilai > 73 && nilai <= 80){
                System.out.println("Nilai mahasiswa " + i + " adalah B+");
            }else if (nilai > 65 && nilai <= 73){
                System.out.println("Nilai mahasiswa " + i + " adalah B");
            }else if (nilai > 60 && nilai <= 65){
                System.out.println("Nilai mahasiswa " + i + " adalah C+");
            }else if (nilai > 50 && nilai <= 60){
                System.out.println("Nilai mahasiswa " + i + " adalah C");
            }else if (nilai > 39 && nilai <= 50){
                System.out.println("Nilai mahasiswa " + i + " adalah D");
            }else
                System.out.println("Nilai mahasiswa " + i + " adalah E");
            
            i++;
        }
    }
}
