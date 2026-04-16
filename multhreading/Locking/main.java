 
public class main {
    public static void main(String[] args) {
         backAcount sbi = new backAcount();
         Runnable task = new Runnable(){
           public void run(){
            sbi.withdraw(250); 
           }
         };

         Thread t1 =  new Thread(task,"Thread 1");
          Thread t2 =  new Thread(task,"Thread 2");
          t1.start();
          t2.start();

    }
}
 