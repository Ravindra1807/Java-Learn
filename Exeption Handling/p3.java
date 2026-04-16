public class p3 {
    public static void main(String[] args) {
        try {
            String s = "ABCD";
            int num = Integer.parseInt(s);
            System.out.println(num);
             

        } catch (NumberFormatException e) {
            System.out.println("Fromat sahi nhi he ");
        }
    }
}
