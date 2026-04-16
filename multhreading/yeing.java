 class ABC extends  Thread {
   public void run(){
     for (int i = 0; i < 10; i++) {
         System.out.println(Thread.currentThread().getName()+ " " + i);
         Thread.yield();
     } 
         
   }
 }
public class yeing{
    public static void main(String[] args) {
        ABC a= new ABC();
        ABC b = new ABC();

        a.start();
        b.start();
       a.yield();
    }
}