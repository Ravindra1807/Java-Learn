class A{
       
     void Info(){
        System.out.println("fsdgfsd");
     }
}

class B extends  A{
     public  void Info(){
        System.out.println(".(hello )");
       
     }
}


public class i12 {
    public static void main(String[] args) {
       A r = new A() {
        public void Info(){
              System.out.println("Anita Kumar");
        }
         
       };
       r.Info();
    }
}
