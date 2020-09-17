
/**
 * Write a description of class AccountType here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class AccountType
{
   // Instance Variables
   private String accountType;
   private int interest;
   
   // Constructor
   public AccountType(String accountType, int interest) {
       this.accountType = accountType;
       this.interest = interest;
    }
   
   // Mutator Methods
   
   // Accessor Methods
   public String getAccType() {
       return accountType;
    }
    
   public int getInterest() {
       return interest;
    }
}
