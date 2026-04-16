 
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class dead {
    private  final Lock lock = new ReentrantLock();

    public void OuterMethod(){
        lock.lock();
        try{
            System.out.println("Outer Method ");
            innerMethod();

        }finally{
            lock.unlock();  
                    

         
        }

    }
    public void innerMethod(){
        lock.lock();
          System.out.println("Inner Method"); 
     
           }    

    public static void main(String[] args) {
        dead d = new dead();
         d.OuterMethod();
    }
}
