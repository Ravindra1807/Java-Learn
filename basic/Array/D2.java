
import java.util.Scanner;

class D2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Row : ");
        int row = sc.nextInt();
         
        int colls = row;

        int[][] Array = new int[row][colls];

        for (int i = 0; i < colls; i++) {
            System.out.println(i + ". Array : ");
            for (int j = 0; j < colls; j++) {
                Array[i][j] = sc.nextInt();
            }
        }
        System.out.println("\nThis Your Array : ");
        for (int i = 0; i < row; i++) {
            System.out.print(i+"INDEX : [");
            for (int f = 0; f < colls; f++) {
               System.out.print(" " + Array[i][f]);   
            }
            System.out.println("]");
        }

    }

}
