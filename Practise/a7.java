import java.util.Scanner;
public class a7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Size : ");
        int s = sc.nextInt();
        int[] a = new int[s];
        
         System.out.println("Enter a Number : ");
        for (int i = 0; i < a.length; i++) {
            a[i] = sc.nextInt();
        }

        System.out.println("This is your Arr : ");
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        } 
          System.out.println( );


        int max = a[0];
        int min = a[0];
        int total = 0;
        for(int c= 0;c<s-1;c++)
            {
        total += a[c];

         if(a[c] > max){
            max = a[c];
         }          
         if(a[c] < min){
            min = a[c];
         }
        
          
            }
        double avg = total/s;

            System.out.println("\nMaximum Number : " + max);               
            System.out.println("Minimum Number :  : " + min);
            System.out.println("Total Number : " + total);
            System.out.println("AVG Number : " + avg);


        }

    }

