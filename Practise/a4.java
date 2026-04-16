class a4 extends Thread {
   

    public static void main(String[] args) {
       
        try {
            int a = 10/0;
            
        } catch (ArithmeticException e) {
            System.out.println("Not Diweided BY zero");

        }
        System.out.println("TRY");
    }
}
