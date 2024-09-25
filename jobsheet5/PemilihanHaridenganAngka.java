package jobsheet5;

import java.util.Scanner;

import jobsheet3.caba;

public class PemilihanHaridenganAngka {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String dayType;
        int dayName;

        System.out.println("masukan nomer hari : ");
        dayName = sc.nextInt();

        switch (dayName) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                dayType = "weekday";
            
            case 6:
            case 7:
                dayType = "weekeend";
                
                break;
        
            default:
                dayType = "invalid number";
                break;
        }
        System.out.println("hari " + dayName + " adalah " + dayType);
    }
}
