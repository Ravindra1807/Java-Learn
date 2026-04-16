package pac;
class fib{
    public static void printFib(int a,int b,int n) {
        int c = a+b;
    }
    public static void main(String[] args) {
        int a = 0;
        int b = 1;
        System.out.println(a);
        System.out.println(b);
        int n = 7;

        printFib(a, b, n-2);
    }
}