

import java.util.Scanner;
import java.lang.Math;


class Main {
    public static void main(String[] args) {
      
      Scanner scan = new Scanner(System.in);
      
      int years= 1970;
      int secondsGiven= scan.nextInt();
      
      years= (years+(secondsGiven/31104000));
      int yearLeftOver= (secondsGiven%31104000); 
      
      int months= (yearLeftOver/2592000);
      int monthLeftOver= (yearLeftOver%2592000);
      
      int days = (monthLeftOver/86400);
      int dayLeftOver= (monthLeftOver%86400); 
      
      int hours= (dayLeftOver/3600);
      int hourLeftOver= (dayLeftOver%3600);
      
      int minutes= (hourLeftOver/60);
      int seconds= (hourLeftOver%60);
      
      System.out.println ("Year: " +years);
      System.out.println ("Month: " +months);
      System.out.println ("Day: " +days);
      System.out.println ("Hour: " +hours);
      System.out.println ("Min: " +minutes);
      System.out.println ("Sec: " +seconds);
    }
}