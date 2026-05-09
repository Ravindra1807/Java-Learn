interface Multiply {
    int mul (int a , int b);
}
public class multiplestatmentLam {
     public static void main(String arg[]){
        Multiply p = (a,b) -> {
            int result = a*b;
            return result;
        };
        System.out.println(p.mul(12,2));
     }
}