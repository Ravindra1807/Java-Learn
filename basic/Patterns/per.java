class per{ 
    public static void main(String[] args) {
        int col = 5;
        int row = 5;

         for(int i = 1;i<col;i++)
         {
            for(int j = 1;j<row;j++){
                if(j<=i){
                    System.out.print(" * ");
                }else{
                    System.out.print("   ");
                }
            }
            System.out.println();
         }
    } 

    
}
