class half{
    public static void main(String agu[]){
        
        // for (int i = 1; i <= 5; i++) {
        //     for(int j = 1; j <= i ; j++){
        //         System.out.print(j+" ");
        //     }
        //     System.out.println("");
        // }
        int n = 5;
        for (int i = 1; i <= n; i++) {
            for(int j = 1; j <= n-i+1; j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }
}