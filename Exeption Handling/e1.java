public class e1 {
    public static void main(String a[]){
         int arr[] = new int[5];
     //      try {
     //           System.err.println(arr[5]);
     //           int result = 10/0;
     //           System.err.println(result);
     //      }  catch(ArithmeticException | ArrayIndexOutOfBoundsException t){
     //        System.out.println("Exeption Handling ....");
     //      }  catch(RuntimeException e){

     //      }
     //    finally{
     //       System.out.println("Hello World");
     //    }
     try{
           Number(arr);
     }catch(ArrayIndexOutOfBoundsException e){
          System.out.println("catch Exception");
     }
        

     System.out.println("Hello");
    }

    static int Number(int arr[]) throws ArrayIndexOutOfBoundsException{
     return arr[7];
    }
}
