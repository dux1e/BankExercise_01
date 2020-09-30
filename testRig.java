

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class testRig.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class testRig
{
    private BankAccount bankAcco1;
    private BankAccount bankAcco2;
    private BankAccount bankAcco3;
    private Customer customer1;
    private Bank bank1;
    private Customer customer2;

    
    
    
    
    

    
    
    
    

    /**
     * Default constructor for test class testRig
     */
    public testRig()
    {
    }

    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     */
    @Before
    public void setUp()
    {
        bankAcco1 = new BankAccount();
        bankAcco2 = new BankAccount();
        bankAcco3 = new BankAccount();
        bankAcco1.deposit(1000);
        bankAcco2.deposit(1500);
        bankAcco3.deposit(500);
        customer1 = new Customer("Joakim", "Landegaden", "9440", "Landbyen", "+45 11 22 33 44");
        customer1.addAccount(bankAcco1);
        customer1.addAccount(bankAcco2);
        customer1.addAccount(bankAcco3);
        bank1 = new Bank("Danske bank");
        bank1.addCustomers(customer1);
        bank1.printInfo();
        customer2 = new Customer("Ib", "Langgade", "9000", "Aaleren", "12345678");
        bank1.addCustomers(customer2);
    }

    /**
     * Tears down the test fixture.
     *
     * Called after every test case method.
     */
    @After
    public void tearDown()
    {
    }
}
