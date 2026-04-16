
public class run extends Thread {
     public void run(){
            System.out.println("RUNNNING ");
         try {
             Thread.sleep(5000);
         } catch (InterruptedException e) {
             System.out.println(e);
         }
        
    }
   public static void main(String[] arg) throws InterruptedException
   {

    System.out.println(Thread.currentThread().getName());
    run r = new run();
    System.out.println(r.getState());

    r.start();

    System.out.println(r.getState());

     
    Thread.sleep(1000);

    System.out.println(r.getState());

    r.join(); 

    System.out.println(r.getState());
   }    
}
