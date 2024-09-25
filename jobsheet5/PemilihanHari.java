package jobsheet5;

import java.util.Scanner;

import jobsheet3.caba;

public class PemilihanHari {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String dayName, dayType;

        System.out.println("masukan Nama Hari : ");
        dayName = sc.nextLine();

        switch (dayName.toLowerCase()) {
            case "monday":
            case "Tuesday":
            case "wednesday":
            case "thursday":
            case "friday":
                dayType = "weekday";
            
            case "saturday":
            case "sunday":
                dayType = "weekeend";
                
                break;
        
            default:
                dayType = "invalid name";
                break;
        }
        System.out.println("hari " + dayName + " adalah " + dayType);
    }
}
