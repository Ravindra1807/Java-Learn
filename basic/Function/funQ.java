import java.util.Scanner;
class funQ{

    public static void  Q1(int x,int y,int z){
     int sum = x+y+z;
     float Average = sum/3;
     System.out.println("Your Avergae : " + Average);    
    }
     public static void  Q2(int n){
        int odd = 0;
        int even = 0;
       for(int i = 0;i<=n;i++){
        if(i%2==0){
            even += i;
        }else{
           if(i%2!=0){
            odd += i;
           }
          
        } 
   
       }
        System.out.println("\neven : "+ even + "\nodd : "+ odd );
     }
    
    public static void main(String agu[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();  
        Q1(a,b,c);
        Q2(a);


    } 
}