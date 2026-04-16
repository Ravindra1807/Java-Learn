
 class Shpe{      //Base class
    public  int a;
    public int b;
    public void p(){
        System.out.println(a);
        System.out.println(b);
    }
    
}
//  extends ka matlab hi Inheritanse hOTA HE 
class  AB extends Shpe{
    public void p(int a){
        System.out.println(a);
    } 
     //Base - Drived Class   1.Single Inheritanse
 }

 class  CD extends AB{
    public void p(int a,int b){
      System.out.println(a+b);
    }
 }


public class e1{
     
     public static void main(String[] args) {
       AB t1 = new AB();
       t1.a = 12;
       t1.b = 22;

      t1.p();
      t1.p(10);
  
     }
}