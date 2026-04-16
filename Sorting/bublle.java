class bublle{
      public static void main(String[] args) {
          int arr[] = {1,5,3,7,6,4,2};
          System.out.print("normal ARR : ");
            for (int i = 0; i < arr.length; i++) {
              System.out.print(arr[i]  +  " ");
          }
          // time complexity = o(n^2)
          //bublle sort  
          for (int i = 0; i < arr.length-1; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if(arr[j] > arr[j+1]){
                    //Swap
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;

                }
            }
              
          }
        System.out.print("\nReverse ARR : ");

          for (int i = 0; i < arr.length; i++) {
              System.out.print(arr[i]  +  " ");
          }

          
      }
}