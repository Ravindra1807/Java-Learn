
  class MyThread extends Thread {

    private Counter counter;

    public MyThread(Counter counter) {
        this.counter = counter;
    }

    public void run(){
      for (int i = 0; i < 1000; i++) {
          counter.increament();
      }
    }
  
}

  class Counter {

    private int count = 0;

    public synchronized void increament() {  //Critical Section  ..lock lagate he ek thread ke lye 
        count++;
        // synchronized (this) {
        //     count++;
        // }    // specific block me synchronized lagana ho to 
    }

    public int getCount() {
        return count;
    }
}

 public class S1 {

    public static void main(String[] args) {
        Counter counter = new Counter(); // shyeard resocuse
        MyThread t1 = new MyThread(counter);
        MyThread t2 = new MyThread(counter);
        t1.start();
        t2.start();

        try {
            t1.join();
            t2.join();
        } catch (Exception e ) {

        }
        System.out.println(counter.getCount());
    
    }
}
