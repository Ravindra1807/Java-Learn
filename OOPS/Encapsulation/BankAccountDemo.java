
class Account {     // getters & setters   se ham log private data do accses ka rskte he 

    public String name;
    protected String Email;
    private String Password;

    public void Details() {
        System.out.println(name);
        System.out.println(Email);

    }

// getters & setters   se ham log private data do accses ka rskte he 
    public String getPassord() {
        return this.Password;
    }

    public void setPassword(String pass) {
        this.Password = pass;
    }
}

public class BankAccountDemo {

    public static void main(String[] args) {
        Account account1 = new Account();
        account1.name = "Rahul";
        account1.Email = "rmgb1855@gamil.com";
        account1.setPassword("ABCD");
        account1.Details();
        System.out.println(account1.getPassord());

    }
}
