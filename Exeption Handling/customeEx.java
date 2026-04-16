 import java.util.Scanner;
 public class customeEx {
    public static void main(String arg[])   
    {
        Scanner sc = new Scanner(System.in);
        try{
            int age = sc.nextInt();
            if(age>100){
             throw new MyException("Hello Error");
            }
            if(age<100){
                throw new ArithmeticException("Under 100");
            }
        }catch(Exception e){
          System.out.print(e);
        }
 }
}
class MyException extends RuntimeException {
    public MyException(String Massage){
        super(Massage);

    }
}
