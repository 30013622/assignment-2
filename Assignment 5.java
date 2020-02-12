import java.util.Scanner;
import java.lang.Math;


class Main {
    public static void main(String[] args) {
      
      Scanner scan = new Scanner(System.in);
      
       
       System.out.println( "How long do you want the array?");
          int x = scan.nextInt();
          
       if(x>0){
          for(int i = 0; i < x; i++){  
            System.out.println( "Enter a number");
            double y = scan.nextDouble();
          } 
       } else {
          System.out.println("Not a valid length!"); 
       }
    }
}