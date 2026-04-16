public class e3 {
    public static void main(String[] args) {
        try {
            int a = 10/0;
            int arr[] = new int [3];
            arr[4] = 20;

        } catch (ArithmeticException a){
System.out.println("Devided by Zero (ERROR) ");
        } catch (ArrayIndexOutOfBoundsException a){
System.out.println("Array Out OF Index (Error)" );
         }
           catch (Exception e) {
            System.out.println("Array Index Out Of Bounds Exception;");
        }
    }
}
