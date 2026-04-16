 class ABC extends  Thread {
   public void run(){
     
          
             try {
                 Thread.sleep(1000);
                 System.out.println("Thread is Runing..");
             } catch (InterruptedException e) 
             {
               System.out.println("Thread InterruptedException .. ");
             }
    
   }
 }
public class intrrupte{
    public static void main(String[] args) {
        ABC a= new ABC();
        a.start();
        a.interrupt(); //interrupt Method
    }
}