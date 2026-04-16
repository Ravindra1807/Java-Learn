 import java.util.Scanner;
 class basicR{
    public static void PrintR(int i,int n,int Sum) {
        if(i == n){
            Sum += i;
            System.out.println(Sum);
            return;
        }
        Sum += i;
        PrintR(i+1, n, Sum); 
       
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       PrintR(1, 10, 0); 


    }
 }