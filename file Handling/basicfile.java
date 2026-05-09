
import java.io.File;





public class basicfile {

    public static void main(String[] args) {
        //this code to create a new file 
        /* 
        File myfile = new File("skull_suthar.txt");
        try {
            myfile.createNewFile();
        } catch (IOException e) {
            System.out.println("Unable to create this ");
            e.printStackTrace();
        }
         */
        //code to write to a file
        /*
        try {
            FileWriter fileWriter = new FileWriter("skull_suthar.txt"); 
             fileWriter.write("THIS IS A FIRST FILE MY PROGRAM \nHello World");
             fileWriter.close();
        }catch(IOException E ){
            E.printStackTrace();
        } 
      

        // Reading A File 
        File myfile = new File("kiu.txt");
        try{
         Scanner sc = new Scanner(myfile);
         while(sc.hasNextLine()){
            String line = sc.nextLine();
            System.out.println(line);
         }
         sc.close();

        }catch(FileNotFoundException e){
            e.printStackTrace();
        } 
             */

        //  Deleteding A File
        File Myfile = new File("skull_suthar.txt");
        if(Myfile.delete()){
            System.out.println("I have Deleted This File : " + Myfile.getName() );
        }else {
            System.out.println("Error");
        } 
    }
}
