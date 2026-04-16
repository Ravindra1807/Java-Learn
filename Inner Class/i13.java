class Bank{

      String AccountName;
      long AccountNumber;

    private double Balance;
  

    public Bank(String AccountName, long  AccountNumber, double Balance) {
        this.AccountName = AccountName;
        this.AccountNumber = AccountNumber;
        this.Balance =Balance;
    }

    public Bank() {
        System.out.println("Bank Creating .. | ");
    }
    
   
    
    class Customer{

        public Customer()
         {
         }
        


        void DR(double DR)
    {
        if(Balance - DR >= 0 )
        {
          Balance -= DR;
           System.out.println("successfully Debit Your Bank $" + DR);
        System.out.println("Your Your balance is ₹" + Balance);
        } else
               {
                System.out.println("Something is wrong ");
         System.out.println("Your Your balance is $" + Balance);
       
        }
    }

         void CR(double CR)
    {
        if(CR + Balance >= 0)
            {
       Balance +=CR;
        System.out.println("successfully Creadit Your Bank $" +CR);
        System.out.println("Your Your balance is $" + Balance);
        }
        else
            {
        System.out.println("Something is wrong ");
         System.out.println("Your Your balance is $" + Balance);
        }
    }
    void CoustomerInfo(){
        System.out.println("Customer Name : " + AccountName );
        System.out.println("Customer Number : " + AccountNumber);
        System.out.println("Bank Balance is : " + Balance);
    }
    }
    

}
public class i13 {
    public static void main(String a[]){
       Bank b = new Bank("Ravindra Kumar", 534545626, 100.32);
         
       Bank.Customer c1 = b.new Customer();

   
       c1.CoustomerInfo();
    }
    
}
