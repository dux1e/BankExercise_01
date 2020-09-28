
/**
 * Write a description of class Customer here.
 *
 * @author Joakim Christensen
 * @version 29-09-2020
 */
public class Customer
{
    //Instance Variables
    private String name;
    private String street;
    private String postalCode;
    private String town;
    private String telephoneNo;
    private BankAccount myBankAccount;

    //Constructor
    public Customer(String name, String street, String postalCode, String town, String telephoneNo) {
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
    public void getDetail() {
        System.out.println("Navn på kunden er: " + name);
        System.out.println("Kunden bor på: " + street);
        System.out.println("Kundens pustnummer er: " + postalCode);
        System.out.println("Kunden bor i: " + town);
        System.out.println("Kundens telefonnmummer er: " + telephoneNo);
        if(myBankAccount != null) {
            System.out.println("Kunden har " + myBankAccount.getBalance() + "DKK stående på sin konto");
            myBankAccount.getAccountTypeDetail();
        } else {
            System.out.println("Kunden har ingen konti");
        }
    }

}
