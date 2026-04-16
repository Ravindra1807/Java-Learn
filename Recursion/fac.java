class fac{
    public static int R(int a) {
        if(a == 0 || a == 1 ){
            return 1;
        } 
        int fact_nm1 = R(a-1);
        int fact_n = a * fact_nm1;
        return fact_n;
    }
    public static void main(String[] args) {
        int a = 5;
        int b = R(a);
        System.out.println(b);
    }
}