/*/Encapsulation + Inheritance
✔ Private variables + getter/setter
✔ Single + Multilevel inheritance
✔ super keyword
✔ Constructor call order
*/
class Department{
String depaerment;

    public Department(String department)
     {
        this.depaerment = depaerment;
    }

}
class Bank extends Department{
protected  String Bankname;
protected  String FIC_CODE;

    public Bank(String Bankname, String FIC_CODE , String department) {
      super(department);
        this.Bankname = Bankname;
        this.FIC_CODE = FIC_CODE;
    }

    void Bank() {
    System.out.println("Bank Name :  " + Bankname);
    System.out.println("FIC_CODE : " + FIC_CODE);   
   }

    
    

}
class Customer extends Bank {
public String Cname;
private int OTP;
private double balance;

    public Customer(String Cname, int OTP, double balance, String Bankname, String FIC_CODE ,String department) {
        super(Bankname, FIC_CODE,department);
        this.balance = balance;
        this.Cname = Cname;
        this.OTP = OTP;
        this.balance = balance;
    }
    void getter(int OTP){
        this.OTP = OTP;
    }
    int  setter(int OTP){
        return OTP;
    }
   
    

void dis(){
    System.out.println("Customer name : " + Cname);
    System.out.println("Balance : " + balance);
    System.out.println("OTP : " + OTP );
    System.out.println("Department : " + depaerment);
     super.Bank();

 }
}
 class day_1_2{
    public static void main(String[] args) {
        Customer c1 = new Customer("Ravindra Kumar", 1855, 2000, "RMGB BANK OF RAJASTHAN", "RMGB24JAS","RAJASTHAN");
        c1.getter(1200);
        
        c1.dis();
    }
}
 