
/**
 * Write a description of class AccountType here.
 *
 * @author Joakim Christensen
 * @version 29-09-2020
 */
public class AccountType
{
    // Instance Variables
    private String accountType;
    private double interest;

    // Constructor
    public AccountType(String accountType, int interest) {
        this.accountType = accountType;
        this.interest = interest;
    }

    // Mutator Methods
    public void setAccType(String accountType) {
        this.accountType = accountType;
    }
    
    public void setInterest(double interest) {
        this.interest = interest;
    }

    // Accessor Methods
    public String getAccType() {
        return accountType;
    }

    public double getInterest() {
        return interest;
    }
}
