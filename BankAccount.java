
/**
 * This is a Class for the banking exercise 01
 *
 * @author Joakim Christensen
 * @version 29-09-2020
 */
public class BankAccount {
    // instance variables for the balance
    private double balance;
    private AccountType myAccountType;

    /**
     * Constructor for objects of class BankAccount
     */
    public BankAccount()
    {
        balance = 0;
    }
    
    public BankAccount(AccountType accType) {
        this.myAccountType = accType;
        balance = 0;
    }
   
     /**
     * Mutator methods down here
     * They usually start with void
     */  
    /**
     * Add funds to banking account
     */
    public void deposit(double amount) {
        balance += amount;
    }
  
    
    /**
     * Boolean ifølge læren
     * Man må aldrig return i en statement
     */
    public boolean withdrawTeacher(double amount) {
        boolean success = false;
        if(balance >= amount) {
            balance -= amount;
            success = true;
        }
        return success;
    }
    
   
    //Accessor methods down here
     
    /**
     * Show balance for banking account
     */
    public double getBalance() {
        return balance;
    }
    /**
     * You're rich :)
     * Da man ikke skal returne noget skal man ikke skrive 
     * public String men bare   
     * publig void
     */
    public void checkIfMillionaire() {
        if (balance >= 1000000) {
            //If millionaire return the message "You are rich!"
            System.out.println("You are rich");
        } else {
            //Else Return "You are not a millionaire"            
            System.out.println("You are not a millionaire");
        }
    }
    
    public AccountType getAccountType() {
        return myAccountType;
    }
    
    public void getAccountTypeDetail() {
        System.out.println("The account type is: " + myAccountType.getAccType());
        System.out.println("The interest is: " + myAccountType.getInterest());
    }
}
