 
interface Add {
   int sum(int a, int b);
}
public class withoutlam {
    public static void main(String[] args) {
        Add o = new Add(){
           @Override
                public int sum (int a, int b){
                    return a+b;
                }
        };
     
        System.out.println(o.sum(12, 21));
    }
}