 
 interface Massage {

    void print();

}
public class NoParamenterLam {
     public static void main(String arg[] ){
        Massage m = () ->  System.out.println("Hello World");

        m.print();
     }    
}