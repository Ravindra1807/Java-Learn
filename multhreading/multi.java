class th implements  Runnable {
    public void run(){
        for (int i = 0;i<120 ;i++ ) {
            System.out.println("hy");
        }
    }
}
public class multi {
      public static void main(String[] args) {
          th a = new th( );   // new
          Thread t = new Thread(a);   
         t.start();          // Runnable
          for ( int i=0;i>100 ; i++) {
System.out.println("name");         
 }
      }
}
