
import java.util.Scanner;

class InvertedHalfPermid {

    public static void main(String agru[]) {
        Scanner sc = new Scanner(System.in);
        int a = 5;
        int b = a;

        System.out.println("Pettern : ");

        for (int i = 1; i < a; i++) {
            for (int j = 1-i; j < b; j++) {
                if(i<=j){
                System.out.print("* ");

                }else{
                    System.out.print("");

                }
            }
            System.out.println("");
        }
    }
}
