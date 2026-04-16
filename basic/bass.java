import java.util.Scanner;

  class bass{
      public static void main(String[] args) {
          Scanner sc = new Scanner(System.in);
          System.out.println("Enter Your Age : ");
          
          int age = sc.nextInt();
          if(age > 18){
            System.out.println("Adult ");
            }else{
                System.err.println("Not Adult");
            }

          

      }

}