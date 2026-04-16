
import java.util.Scanner;

class  roted {

    public static void main(String agru[]) {
        Scanner sc = new Scanner(System.in);
        int n = 4;

        System.out.println("Pettern : ");

         for(int i = 1;i<=n;i++){
             for(int j = 1;j<=n-i;j++){
                System.out.print(" ");
             }

             for(int  j = 1;j <= i; j++){
            System.out.print("*");
             }
             System.out.println();
         }
    }
}
