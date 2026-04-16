import java.util.Scanner;
class khali {

    public static void main(String agrp[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Collum  : ");
        int col = sc.nextInt();
        System.out.print("Enter Row : ");
        int row = sc.nextInt();

        for (int i = 1; i <= col; i++) {

            for (int j = 1; j <= row; j++) {
                //cell
                if (i == 1 || j == 1 || i == col || j == row) {
                    System.out.print(" * ");
                }else{
                    System.out.print("   ");
                }
            }
            System.out.println();

        }
    }
}
