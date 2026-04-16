
import java.util.Scanner;

class bbb {

    public static void main(String agr[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER SIZE : ");

        int size = sc.nextInt();
        int[] Marks = new int[size];

        System.out.println("Enter Array : ");
        for (int i = 0; i < Marks.length; i++) {
            Marks[i] = sc.nextInt();
        }
        System.out.println("Search Element : ");

        int x = sc.nextInt();

        System.out.println("\n");
        for (int i = 0; i < Marks.length; i++) {
            if (Marks[i] == x) {
                System.out.println("Fund " + i + " at INDEX : " + Marks[i]);
                break;
            }
        }

    }
}
