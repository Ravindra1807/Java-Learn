
/** *✅ Q1. Multiplication Table with Logic***
 ***User से कोई number लो।***
 ***उसका 1 से 20 तक table print करो।***
 ***लेकिन:***
 ***अगर number divisible by 3 है → "Skip 3" वाली row skip करो (continue)***
 ***अगर number divisible by 7 है → loop को 7 पर ही रोक दो (break)***
 */
import java.util.Scanner;

public class TableWithCondition {

    public static void main(String agu[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter A Number : ");
        int a = sc.nextInt();
        System.out.println(a + " Table : ");
        for (int i = 1; i <= 20; i++) {

            if (a % 7 == 0 && i == 7) {
                break;
            }
            if (a % 3 == 0 && i == 3) {
                continue;
            }
            System.out.println(i + ". " + (i * a));

        }

    }
}
