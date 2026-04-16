 
public class IntrinsicLock {
    public static void main(String[] args) {
         BackAcount sbi = new BackAcount();
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

class BackAcount {

    private int balance = 400;
 
    public synchronized void withdraw(int amount) { //synchronized keyword IntrinsicLock me aata he 
        System.out.println(Thread.currentThread().getName() + " attamting to withdraw " + amount);
        if (balance >= amount) {
            System.out.println(Thread.currentThread().getName() + " procesing with withdrawl ");
            try {
                Thread.sleep(10000);
            } catch (InterruptedException e) {
            }
            balance -= amount;
            System.out.println(Thread.currentThread().getName() + " Completed withdrawl. Remaning balance " + balance);
        } else {
            System.out.println(Thread.currentThread().getName() + " insufficient balance");
        }
    }
}
