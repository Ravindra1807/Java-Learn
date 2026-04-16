package pac;

class Pen{
    String color;
    String types;

    public void Write(){
        System.out.println("Writing somthing ");
       
     }
     public void Printcolor(){
         System.out.println(this.color );
        
     }
    
}

public class a1{
    public static void main(String[] args) {
           Pen p1 = new Pen();
          p1.color = "blue";
          p1.types = "gel";
 
         
          Pen p2 = new Pen();
          p2.color = "Red";
          p2.types = "non";

           p1.Printcolor();
           p2.Printcolor();

    }
}