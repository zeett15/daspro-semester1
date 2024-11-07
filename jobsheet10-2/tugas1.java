
import java.util.Scanner;

public class tugas1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [][]survey = new int[2][2]; 
        
        double rata2;
        
        for(int h = 0; h < survey.length; h++){
            System.out.println("respondem " +(h+1));
            for(int i = 0; i < survey[h].length; i++){
                System.out.print("Pertanyaan " + (i+1)+ " : ");
                survey[h][i] = sc.nextInt(); 
                if(survey[h][i] <1 || survey[h][i] >5){
                    continue;
                }
               
            }
            System.out.println();
        }
        System.out.println();
        System.out.println("Rata-rata per responden");
        for(int h = 0; h < survey.length; h++){
            int nilai = 0;
            System.out.println("Responden "+ (h+1));
            for(int i = 0; i < survey[h].length; i++){
                System.out.println("Pertanyan " + (i+1) + " : " +survey[h][i]);
                nilai += survey[h][i];
                
            }
            System.out.println("total nilai: " + nilai);
            rata2 =  nilai/survey[h].length;
            System.out.println("rata-rata: " + rata2);

        }
        System.out.println();
        System.out.println("Rata-rata setiap pertanyaan");
        for(int h = 0; h < survey[0].length; h++){
            int nilai = 0;
            System.out.println("Pertanyaan ke-"+ (h+1));
            for(int i = 0; i < survey[h].length; i++){
                System.out.println("respondden ke-" + (i+1) + " : " +survey[i][h]);
                nilai += survey[i][h];
                
            }
            rata2 = nilai/survey.length;
            System.out.println("nilai setip pertanyaan "+(h+1) +" : "+ nilai+ " : " );
            System.out.println("Rata-rata: " + rata2);
            
           

        }
    }
}