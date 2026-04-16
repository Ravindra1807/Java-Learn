 class ABC extends Thread {
     public void run (){
        while(true){
            System.out.println("(Hello)");
        }
     }
     
 }
public class deamon {
    public static void main(String[] args) {
        ABC a = new ABC();
       

         a.setDaemon(true);  // SET deamon EK THREAD HE JO MAIN PURA HONE PAR KHATAM HO JAATA HE 
         
        a.start();
        System.out.println("Done Bro");

    }
}