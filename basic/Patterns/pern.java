import  java.util.Scanner;
class pern{
    public static void main(String argu[]){
        Scanner sc = new Scanner(System.in);
        int a = 5;
        int b = a;

        System.out.println("Pettern : ");

        for(int  i = 0;i<a;i++){
            for(int j = 0;j<b;j++){
                System.out.print(" * ");
            }
            System.out.println("");
        }
    }
}