
import java.util.Scanner;

public class SearchNilai22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        int hasil = 0;
        System.out.print("Masukan banayknya elemen yang akan di input: ");
        n = sc.nextInt();

        int[] arrNilai = new int [n];
        for(int i = 0; i<arrNilai.length; i++){
            System.out.print("Masukan nilai mahasiswa ke-"+(i+1)+": ");
            arrNilai[i]=sc.nextInt();
        }System.out.println();

        int key;
        System.out.print("Masukan nilai yang akan di cari: ");
        key = sc.nextInt();

        for(int i = 0; i < arrNilai.length; i++){
            if(key == arrNilai[i]){
                hasil = i;
                break;
            }
        }
        if (hasil==0) {
            System.out.println();
            System.out.println("Nilai yang di cari tidak di temukan");
        }else{
            System.out.println();
            System.out.println("Nilai " + key + " merupakan nilai dari mahasiswwa ke-" + (hasil+1));
            System.out.println();
        }
        
            
        
        
    }
}
