
/**
 * Write a description of class Customer here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Customer
{
    //Instance Variables
    private String name;
    private String street;
    private int postalCode;
    private String town;
    private String telephoneNo;
    private BankAccount myBankAccount;
    
    //Constructor
    public Customer(String name, String street, int postalCode, String town, String telephoneNo) {
        this.name = name;
        this.street = street;
        this.postalCode = postalCode;
        this.town = town;
        this.telephoneNo = telephoneNo;
    }
    
    //Mutator Methods
    public void addAccount(BankAccount account) {
        this.myBankAccount = account;
    }
    
    //Accessor Methods
}
