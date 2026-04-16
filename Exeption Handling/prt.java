class prt {
    static void divide(int a, int b) throws ArithmeticException 
    {
        if(b == 0) {
            throw new ArithmeticException("Divide by zero");
        }
        System.out.println(a / b);
    }

    public static void main(String[] args) {
        divide(10, 0);
    }
}

