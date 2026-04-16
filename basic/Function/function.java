import java.util.Scanner;
class function{
    public static int print(int x,int y){
        return x+y;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        // int c = print(a,b);

        // System.out.println("Sum of two Number : " + c);

        System.out.println("Sum of Two NUMBER : " + print(a,b));
        

         
      
    }
}