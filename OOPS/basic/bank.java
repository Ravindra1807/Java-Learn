
 
class Account{     // getters & setters   se ham log private data do accses ka rskte he 
public   String name;
protected  String Email;
private String Password;
public void Detils(){
    System.out.println(name);
    System.out.println(Email);
   
}

// getters & setters   se ham log private data do accses ka rskte he 

public String getPassord(){
    setPassword(randomPass);
    return this.Password;
}
public void setPassword(String pass){
    this.Password = pass;
}
}

 
public class bank{
    public static void main(String[] args) {
        Account account1 = new Account();
        account1.name = "Rahul";
        account1.Email = "rmgb1855@gamil.com";
        account1.setPassword("ABCD");
        account1.Detils();
        System.out.println(account1.getPassord());


       
    }
}