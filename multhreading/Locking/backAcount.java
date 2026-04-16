 
public class backAcount {

    private int balance = 500;
 
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

 
