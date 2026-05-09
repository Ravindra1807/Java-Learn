 
public class RunnableLam {
   public static void main(String arg[]) {
    Runnable run = () -> {
        System.out.println("Hello Runnable .... ");
        };
        new Thread(run).start();
   }  
}