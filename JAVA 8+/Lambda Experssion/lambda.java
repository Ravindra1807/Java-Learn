 interface  addall{
    int sum(int a , int b);
 }
public class lambda {
    public static void main(String[] args) {
        addall obj = (a, b) -> a + b;
        
        System.out.println(obj.sum(5,4));
    }
    
}