import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class basic {
    public static void main(String[] args) {
        /*File mydoc  = new File("Nruto.txt");
        try{
        mydoc.createNewFile();
        System.out.println("Create a File");
        }catch(IOException e ){
            e.printStackTrace();
        } 
         try{
         FileWriter my = new FileWriter("Nruto.txt");
         my.write("MY name is Ravindra Kumar ");
         my.close();
         }catch(IOException e ){
            e.printStackTrace();
         }
        */

         File file = new File("Nruto.txt");
        
         try{
          Scanner sc = new Scanner(file);
          while(sc.hasNextLine() ){
        String line =sc.nextLine();
        System.out.println(line);
          }
         }catch(FileNotFoundException e){
                e.printStackTrace();
         }
         
    }
}
