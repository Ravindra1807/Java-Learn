 import java.util.Scanner;
class cons{
    public static void main(String[] args) {
       
        Scanner sc = new Scanner(System.in);
       
    String name = sc.next();
    String name1 = sc.next();
    
    // Opration 1.
    // String + String 
    String Fullname = name + " " + name1;
    System.out.println("1. Full Nmae : " + Fullname);
    
    // Opration 2.
    // charAt()
      System.out.print("2. count Character : ");
      System.out.println(Fullname.length());
    for (int i = 0; i <Fullname.length() ; i++) {
        System.out.println(i+1 + " " + Fullname.charAt(i));
    } 

    // Opration 3.
    //  .substring()  
    String name3 = Fullname.substring(8);
    System.out.println("\n3. Divided Character : " + name3); 

     }
}

    

