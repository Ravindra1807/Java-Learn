
public class ThreadDemo {

    public static void main(String[] args) {

        Runnable r = () -> {
            for (int i = 0; i < 10; i++) {
                System.out.println(i + "Lambda Expression .. ");
            }
        };
        r.run();
      //   Thread childthread = new Thread(r);
      //  childthread.run();

    }
}
