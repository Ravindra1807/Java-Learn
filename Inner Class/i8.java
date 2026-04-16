class outer{
    static int i = 55;
    static class Inner{
         void Info(){
            outer o = new outer();
            System.out.println(o.i);
        }
    }
}

class ABCD{
    static void A(){
        System.out.println("THALAPATHIY");
    }
}

public class i8 {
    public static void main(String[] args) {
        // outer o = new outer();
        outer.Inner i = new outer.Inner();
        i.Info();
        // outer.Inner.Info(); 
        //    ABCD.A();

    }
}
