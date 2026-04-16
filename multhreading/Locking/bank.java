
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class bank {

    private int balance = 500;

    private final Lock lock = new ReentrantLock();

    public void withdraw(int amount) { //synchronized keyword IntrinsicLock me aata he 
        System.out.println(Thread.currentThread().getName() + " attamting to Window " + amount);
        try {
            if (lock.tryLock(1000, TimeUnit.MILLISECONDS)) {

                if (balance >= amount) {
                    try {
                        System.out.println(Thread.currentThread().getName() + " procesing with withdrawl ");

                        Thread.sleep(10000);
                    } catch (InterruptedException e) {
                    } finally {
                        lock.unlock();
                    }
                    balance -= amount;
                    System.out.println(Thread.currentThread().getName() + " Completed withdrawl. Remaning balance " + balance);
                } else {
                    System.out.println(Thread.currentThread().getName() + " insufficient balance");
                }
            } else {
                System.out.println(Thread.currentThread().getName() + " could  not acquire the lock, will try later");
            }
        } catch (InterruptedException e) {
        }

    }
}
