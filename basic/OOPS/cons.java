
import java.util.Scanner;

public class cons {

    String name;
    int Roll;
    String cours;

    public cons(String n, int r, String c) {
        name = n;
        Roll = r;
        cours = c;
    }

    public void show() {
        System.out.println(name + " Roll: " + Roll + "cours: " + cours);
    }

    

    public static void main(String agru[]) {
        Scanner sc = new Scanner(System.in);
        String n = sc.nextLine();
        int r = sc.nextInt();
        String c = sc.nextLine();
        
         
        cons s1 = new cons("Asha", 101, "BCA");

        s1.show();
    }
}
