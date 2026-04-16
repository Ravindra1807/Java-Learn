interface ABC{
    int Marks = 54;
     void Dis();

      static class BCA implements ABC{
          public void Dis(){
            System.out.println(".()");

        }
      }
 } 

abstract class DDD{
void Dis(){
    System.out.println("(System)"); 
    
  }
  abstract void Info();
}

class V{
    void RVN(){
        System.out.println("ggdag");
    }
}
public class i11 {
    public static void main(String[] args) {
    ABC b = new ABC() {   // Anonyoms class
        public void Dis(){
            System.out.println("Ravindra Kumar ");
        }
    };

    //   ABC.BCA.BBB();
    // }
        // DDD d = new DDD() {
            
        //     void Info(){
        //   System.out.println(". ");
        //     }

        // };
        //  ABC.BCA OBJ = new ABC.BCA();
        //  OBJ.Dis();
        V h = new V(){
          static public void B(){
                System.out.println("gfdgaf");
                
            }
           public  void RVN(){
                System.out.println("trtetr");
            }
            
        };
        h.RVN();
       
        
    }
     
     
}
