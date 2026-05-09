
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

 
public class streamdemo {
    public static void main(String[] args) {
         List<Integer> number = Arrays.asList(2,23,4,5,6,3,67,4,5,23,33);
        // Old version 
        // int sum1 = 0;
        // for (int  num : number) {
        //     sum1 += num;
        // }
        int sum = number.stream().filter(x -> x < 200000).mapToInt(n -> n).sum();

        System.out.println("1. Numbers :"+ sum);


        Predicate<Integer> isEeven = d -> d%2==0;
        List<Integer> number1 = Arrays.asList(2,3,4,5,6,76,7,74,5,3);
        System.out.println("List Even elem : ");
        for (Integer elem : number1) {
            if (isEeven.test(elem)) {
                System.out.print(elem + ", ");
            }
        }
        
    }
}