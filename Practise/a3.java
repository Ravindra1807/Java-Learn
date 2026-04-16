
import java.util.Scanner;
public class a3 {
    public static void main(String agu[]){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter Any Number : ");
     int a = sc.nextInt();
            System.out.println("0. All opration ");
            System.out.println("1. Square " );
            System.out.println("2. Cube " );
            System.err.println("3. Squer root " );
            System.out.println("4. Exit ");

      int c = sc.nextInt();
      
     do {
       
        if(c==1){
            System.out.println("1. Square : " + (a*a));
        } 
        if(c==2){
            System.out.println("2. Cube :" + (a*a*a));
        }
        if(c==3){
            System.err.println("3. Squer root : " + Math.sqrt(a));
        }
        if(c==0){
            System.out.println("1. Square : " + (a*a));
            System.out.println("2. Cube :" + (a*a*a));
            
            System.err.println("3. Squer root : " + Math.sqrt(a));
        }
     } while (c >= 4);
     }
   
    }

