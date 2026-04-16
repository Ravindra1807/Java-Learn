class outer{
    String name = "Ravindra KUmar";

    class Inner{

        void Show(){
            System.out.println("INNER CLASS CALLING .. \n " +  "Name : " + name);
        }
    }

    void outerClass()
    {
         Inner i = new Inner();
         i.Show();
    }

}
public class i1{
    public static void main(String[] args) {
       outer o = new outer();
       
       outer.Inner in = o.new Inner();

       in.Show();
       o.outerClass();

    }
}