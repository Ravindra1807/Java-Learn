class oprator{
    public static void main(String[] args) {
        int a = 5;
        int b = 6;
        b = a++;
        System.out.println(b);
        b = ++a;
        System.out.println(b);
        System.out.println(a);
        a = b--;
        System.out.println(a + " " + b);

        int y = a+1;
        System.out.println(y);

        int c = (a & b  & y);
        System.out.println(c); 
        
    }
}