
import java.util.Scanner;
public class a5 {
    public static void main(String agu[]){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter Any Number : ");
     int a = sc.nextInt();            
      
     for (int i = 2; i <= a; i++) {
         boolean prime = true;

         for (int  j = 2;  j <= i/2;  j++) 
            {
                if(i%j == 0){
                    prime = false;
                    break;
                }
             
         }
         if(prime){
        System.out.println(i + " ");
     } 

     }

     
     }
   
    }


