 interface Square {
    int calc(int c);
 }
public class singleParamenterLam {
    public static void main(String ag[]){
        Square s = x -> x * x;

        System.out.println(s.calc(4));
    }
}