
import java.util.Scanner;

public class BioskopWhiteScaanner22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int baris, kolom;
        String nama,next;
        int n;

        String[][] penonton = new String[4][2];
        for(int i=0; i<penonton.length;i++){
            for(int j=0; j<penonton[i].length;j++){
                penonton[i][j] ="***";
            }
        }

        while (true) {
            System.out.println("menu \n 1) input data penonton \n 2) tampilkan data penonton\n 3) exit");
            System.out.print("masukan menu: ");
            n = sc.nextInt();
            sc.nextLine();
            System.out.println();
            if (n < 1 || n >3) {
                System.out.println("input tidak invalid");continue;
            }else if(n == 1){
                while(true){
                    System.out.print("Masukan nama: ");
                    nama = sc.nextLine();
                    System.out.print("Masukan baris: ");
                    baris = sc.nextInt();
                    System.out.print("Masukan kolom: ");
                    kolom = sc.nextInt();
                    sc.nextLine();
                    if(baris<1 || baris>4 || kolom<1 || kolom>2){
                        System.out.println("kursi tidak tersedia, masukan ulang baris dan kolom\n");
                        System.out.print("Masukan baris: ");
                        baris = sc.nextInt();
                        System.out.print("Masukan kolom: ");
                        kolom = sc.nextInt();
                        sc.nextLine();
                    }else if(penonton[baris-1][baris-1] != "***"){
                        System.out.println("kursi telah di pakai, silahkan cari kursi lain");
                        System.out.print("Masukan baris: ");
                        baris = sc.nextInt();
                        System.out.print("Masukan kolom: ");
                        kolom = sc.nextInt();
                        sc.nextLine();
                    }

                    penonton [baris-1][kolom-1] = nama;
                    

                    System.out.print("input penonton lainnya?(y/n): ");
                    next= sc.nextLine();
                    if (next.equalsIgnoreCase("n")) {
                        break;
                    }
                }
               
            }else if(n==2){
                for(int i =0;i<penonton.length;i++){
                    System.out.println("Baris ke-" + (i+1));
                    for(int j=0; j<penonton[i].length; j++){
                        System.out.println((j+1) + ") " + penonton[i][j]);
                    }
                }
            }else if(n==3){
                break;
            }
        }        

        
    }
}
