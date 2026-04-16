class R extends Thread {
    public void run (){ 
      
            try{           
              Thread.sleep(5000);
             } catch( InterruptedException e){
                throw new RuntimeException(e);
             }
 
       // start , sleep , run , join 
    }
}
public class ravi {
    public static void main(String[] args) throws  InterruptedException {
        R r = new R();
        r.start();
     r.join();
    
     System.out.println("Hello");
    }
}