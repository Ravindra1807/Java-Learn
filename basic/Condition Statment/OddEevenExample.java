
import java.util.Scanner;
public class OddEevenExample {
    public static void main(String agu[]){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter 2 Range : ");
     int a = sc.nextInt();
     int b = sc.nextInt();
    int sume = 0;
    int sumo = 0;
    
    System.out.println("Your Range is " + a + " To " + b);
    for (int i = a; i <= b; i++) 
        {
            System.out.print(i + " ");
            if(i%2==0){
             sume += i;
            }else if(i%2!=0){
                sumo += i;
            }
    }
    System.out.println("\n-----------------------");
    System.out.print("\nSum of Even : " + sume + "\nSum of Odd : " + sumo);
    System.out.println("\nTotal of Sum : " + (sume+sumo));


    }
}