class rec{
    public static void print(int i, int n,int Sum) {
       if(i == n){
        Sum += i;
        System.out.println(Sum);
       }else{
       Sum += i;
        print(i+1, n, Sum);
       }
    }
    
    public static void main(String[] args) {

        print(1, 6, 0);
      
    }
}