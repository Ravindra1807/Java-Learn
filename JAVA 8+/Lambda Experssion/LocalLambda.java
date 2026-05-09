// Method Me Local Variable  , Class Me Instins
public class LocalLambda {

    public static void main(String[] args) {

    }

    private void desc() {

        EmployeeE Lambda = () -> {
            int a = 100;   // this is Local variable
            //   System.out.println(this.a); 
            // Instins Variable nhi he is liye error par sidha kare to hoga ..
            System.out.println(a);  
            return "100";
        };

        EmployeeE Ano = new EmployeeE() { 
            // Anonyumus class he ek To ek separat class 
            int x = 200;
            // this is Instins Variable
            @Override
            public String getSalay() {
                // int f = 32;
                // System.out.println(this.f);
                System.out.println(this.x);
                return "100";
            }
        };

    }
}
