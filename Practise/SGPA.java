import java.util.Scanner;


public class SGPA {
    public static void main(String ager[]){
           Scanner sc = new Scanner(System.in);
                 System.out.println("Kitne sub. he ? : ");
                 int n = sc.nextInt();

                 int[] credit = new int[n];
                 int[] gradePoint = new int[n];

                 for (int i = 0; i < n; i++) {
                  System.out.println("Subject " + (i + 1) + ": ");

                  System.out.print("credit : ");
                   credit[i] = sc.nextInt();

                  System.out.println("grade Point (0-10) : ");
                   gradePoint[i] = sc.nextInt();
                 }

                 int totalCredit = 0;
                 int totalPoint = 0;

                 for (int i = 0; i < n; i++) {
                      totalCredit += credit[i];
                    totalPoint += credit[i]*gradePoint[i];
                   
                   
                 }
                 double SGPA = (double)totalPoint/totalCredit;


                 double per = (SGPA - 0.75)* 10;

                 System.out.println("----------------------------------------------------");
                 System.out.printf("SGAP = %.2f\n",SGPA);
                 System.out.printf("Persantage = %.2f%%\n",per);
                 sc.close();

    }
    
}
