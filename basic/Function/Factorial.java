import java.util.Scanner;
class Factorial{

   public static void fac(int n) {
    if(n<0){
        System.out.println("Inavalid Number ");
        return;
    }
    int facto = 1;
    for (int i = n; i >= 1; i--) {
        facto = facto * i;
    }
    System.out.println(facto);
     
}
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n =  sc.nextInt();

        fac(n);
    } 
}