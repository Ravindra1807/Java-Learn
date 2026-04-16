public class p2 {
    public static void main(String[] args) {
        try {
            String name = null;
            System.out.println(name.length());
        }
        catch (NullPointerException e) 
        {
            System.out.println("Object null hai ");
        }
         
        catch (Exception e) {
        }
    }
}
