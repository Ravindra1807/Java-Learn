class AR extends Thread {

  public AR(String name){
    super(name);
  }
  public void run(){
    for (int i = 0; i < 10; i++) {
      for (int j = 0; j < 10000; j++) {
          
      System.out.println("\n");
       System.out.println(Thread.currentThread().getName() + "-Priority : " + Thread.currentThread().getPriority() + "-count : " + i);
        try {
            Thread.sleep(1000);
        } catch (Exception e) {
        }
      }
    }
  }
}
public class pr {
    public static void main(String[] args) throws InterruptedException
     {
        AR a = new AR("Low");
        AR b = new AR("Mid");
        AR c = new AR("Max");
 
        a.setPriority(Thread.MIN_PRIORITY);
        b.setPriority(Thread.NORM_PRIORITY);
        c.setPriority(Thread.MAX_PRIORITY);
         c.start();
        b.start();
        a.start();


      

         
        
    }
}
