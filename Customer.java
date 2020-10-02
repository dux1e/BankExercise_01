
/**
 * Write a description of class Customer here.
 *
 * @author Joakim Christensen
 * @version 29-09-2020
 */
import java.util.ArrayList;

public class Customer
{
    //Instance Variables
    private String name;
    private String street;
    private String postalCode;
    private String town;
    private String telephoneNo;
    private ArrayList<BankAccount> myBankAccounts;

    //Constructor
    public Customer(String name, String street, String postalCode, String town, String telephoneNo) {
        this.name = name;
        this.street = street;
        this.postalCode = postalCode;
        this.town = town;
        this.telephoneNo = telephoneNo;
        this.myBankAccounts = new ArrayList<>();
    }

    //Mutator Methods
    public void addAccount(BankAccount account) {
        myBankAccounts.add(account);
    }

    //Accessor Methods
    public void getDetail() {
        System.out.println("Navn på kunden er: " + name);
        System.out.println("Kunden bor på: " + street);
        System.out.println("Kundens pustnummer er: " + postalCode);
        System.out.println("Kunden bor i: " + town);
        System.out.println("Kundens telefonnmummer er: " + telephoneNo);
        if(myBankAccounts.size() != 0) {
            for(BankAccount account : myBankAccounts) {
                System.out.println("Kunden har " + account.getBalance() + " kr,- stående på sin konto");
                account.getAccountTypeDetail(); 
            }
            System.out.println("");
            System.out.println("Kunden har totalt " + getTotal() + " kr,-");
        } else {
            System.out.println("Kunden har ingen konti");
        }
    }

    public void getNewDetail(double balance) {
        System.out.println("Navn på kunden er: " + name);
        System.out.println("Kunden bor på: " + street);
        System.out.println("Kundens pustnummer er: " + postalCode);
        System.out.println("Kunden bor i: " + town);
        System.out.println("Kundens telefonnmummer er: " + telephoneNo);
        if(myBankAccounts.size() != 0) {
            for(BankAccount account : myBankAccounts) {
                if(balance < account.getBalance()) {
                    System.out.println("Kunden har " + account.getBalance() + " kr,- stående på sin konto");
                    account.getAccountTypeDetail(); 
                } else {
                    System.out.println("Kunden har ingen/andre konti med mindst " + balance + " kr,-");
                }
            }
            System.out.println("");
            System.out.println("Kunden har totalt " + getTotal() + " kr,-");
        } else {
            System.out.println("Kunden har ingen konti");
        }
    }

    public double getTotal() {
        double total = 0;
        for(BankAccount account : myBankAccounts) {
            double balance = account.getBalance();
            total = balance + total;
        }
        return total;
    }
    
    public String getName() {
        return name;
    }
}
