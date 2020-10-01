
/**
 * Write a description of class Bank here.
 *
 * @author Joakim Christensen
 * @version 30-09-2020
 */
import java.util.ArrayList;
import java.util.Iterator;

public class Bank
{
    // Instance variablese
    private String name;
    private ArrayList<Customer> customers;

    // Constructors
    public Bank(String filial) {
        name = filial;
        customers = new ArrayList<>();
    }

    // Mutator functions
    public void addCustomers(Customer customer) {
        customers.add(customer);
    }

    // public void removeCustomer(double threshold) {
    // for(Customer customer : customers) {
    // if(customer.getTotal() < threshold) {
    // customers.remove(customer);
    // }
    // }
    // } dette kan godt give fejl, det skal ændres til et while loop
    // for loop er til aflæsning 

    public void removeCustomer(double balance) {
        int i = 0;
        boolean found = false;
        while(i < customers.size() && !found) {
            Customer customer = customers.getTotal();
            customers.remove(customer);
            i++;
        }
    }

    // Accessor functions
    public void printInfo() {
        if(customers.size() != 0) {
            System.out.println("This shows information about customer(s) in " + name);
            System.out. println("");
            for(Customer customer : customers) {
                customer.getDetail();
                System.out.println("");
            }
        } else {
            System.out.println("The bank has no customers");
        }
    }

    public double getTotalBank() {
        double grandTotal = 0;
        for(Customer customer : customers) {
            double total = customer.getTotal();
            grandTotal = total + grandTotal;
        }
        return grandTotal;
    }
}
