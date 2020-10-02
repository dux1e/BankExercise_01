
/**
 * Write a description of class Bank here.
 *
 * @author Joakim Christensen
 * @version 30-09-2020
 */
import java.util.ArrayList;
import java.util.Iterator;

public class Bank {
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

    public void removeCustomer(double balance) {
        Iterator<Customer> it = customers.iterator();
        while(it.hasNext()) {
            Customer customer = it.next();
            if(customer.getTotal() < balance) {
                it.remove();
            }
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

    public int countPoorCustomersWhile(double balance) {
        Iterator<Customer> it = customers.iterator();
        int count = 0;
        while(it.hasNext()) {
            Customer customer = it.next();
            if(customer.getTotal() < balance) {
                count++;
            }
        }
        return count;
    }

    public int countPoorCustomersFor(double balance) {
        int count = 0;
        for(Customer customer : customers) {
            if(customer.getTotal() < balance) {
                count++;
            }
        }
        return count;
    }

    public Customer findCustomer(String name) {
        Iterator<Customer> it = customers.iterator();
        boolean found = false;
        Customer customer = null;
        while(!found && it.hasNext()) {
            customer = it.next();
            if(customer.getName().equals(name)) {
                found = true;
            }             
        }
        return customer;
    }
    
    public ArrayList<Customer> getSomeCustomers(double threshold) {
        ArrayList<Customer> returnList = new ArrayList<>();
        for(Customer c : customers) {
            if(c.getTotal() >= threshold) {
                returnList.add(c);
            }
        }
        return returnList;
    }

    public double getTotalBank() {
        double grandTotal = 0;
        for(Customer customer : customers) {
            grandTotal = grandTotal + customer.getTotal();
        }
        return grandTotal;
    }
}
