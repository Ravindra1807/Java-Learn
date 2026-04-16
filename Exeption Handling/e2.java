public class e2 {
    public static void main(String[] args) {
        try {
            int a = (10/0)*0;
            System.out.println(a);
            
        }catch (ArithmeticException e)
        {
            System.out.println("Devided by zero arror");
        }
        
         catch (Exception e) 
        {
            System.out.println("Error");

        }
    }
}
