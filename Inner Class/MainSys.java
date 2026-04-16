//  ├── Account (Inner Class)
//  ├── ATM (Inner Class)
//  ├── Rules (Inner Class)
//  └── Transaction (Interface)
 
// SBI (Child class)
// MainApp (Main method)
import java.util.Scanner;

abstract class Bank{

   abstract void getInterestRate();
      
    static class Account 
   {
    private String AccountName;
    private int AccountNumber;
     
    private double balance;

        public Account( String AccountName ,int  AccountNumber, double balance) {
            this.AccountName = AccountName;
            this.AccountNumber = AccountNumber;

            if(balance >= 100)
                {
                this.balance = balance;
            }else{
                System.out.println("Error \nMinimum Required 100Rs ");
            }
        }

        public Account() {
        }
        
        

        public Account(double balance) 
        {
            if(balance >= 100)
                {
                this.balance = balance;
            }else{
                System.out.println("Error \nMinimum Required 100Rs ");
            }
        }
        
        
        class ATM{

           public void ShowBalance(){
            System.out.println("Bank balance : " + balance);
        }

            void withdraw(double withdraw)
            {
                if (balance - withdraw  >= 0)
                     {
                        balance -= withdraw;
                        System.out.println("successfully withdraw Your Bank " + withdraw + "Rs");
                
                }
                 else{
               System.out.println("Something is wrong ");                       
                }
                }
            
        
            void deposit(double deposit)
            {
                if ( balance + deposit <= 1000000) 
                    {
                        balance += deposit;
                    System.out.println("successfully deposit Your Bank $" + deposit);
                }
                  else{
                    System.out.println("OutOff Limit You deposit $" + deposit);
                  }

            
                }
                 void BankAcountInfo(){
                    System.out.println("Bank Account Deatils  ");
                    System.out.println("Account Name : " + AccountName);
                    System.out.println("Account Number : " + AccountNumber);
                    System.out.println("Bank balance Is : " + balance);
                }
            }
            
             
            
        }
         
    
  

   }

class SBI extends Bank{
    public void getInterestRate()
    {
  System.out.println("SBI get Interest Rate 7% ");
    }
} 
 
public class MainSys{
    public static void main(String ARGU[]){
    
        Scanner sc = new Scanner(System.in);
          Bank b = new SBI();

        Bank.Account a = new Bank.Account("Ravindra Kumar", 552234323, 150.32);
        
        Bank.Account.ATM atm = a.new ATM();
        
        System.out.print("Bank Oprations  \n1.Bank Account Info \n2. withdraw \n3.deposit \n4.Chek Bank balance \n");
 
        int r = sc.nextInt(); 
     
        
     
        switch (r) 
        {
         
        case 1 :
            atm.BankAcountInfo();

            break;

            case 2 :
                
            System.out.println("Enter deposit Amount");
              double c2 = sc.nextByte();
            atm.deposit(c2);

            break;

        case 3 :

        System.out.println("Bank balance ");
        atm.ShowBalance();
        break;
       
        case 4 :

            System.out.println("Enter withdraw Amount ");
            double c1 = sc.nextByte();
            atm.withdraw(c1);

                break;
            default:
                System.out.println("Invalid Number Please Try Again ");
         
            throw new AssertionError();

        }
     
     }
        
    }
       

    
