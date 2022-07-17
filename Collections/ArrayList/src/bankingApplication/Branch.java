package bankingApplication;

import java.util.ArrayList;

public class Branch {
   private String name;
   ArrayList<Customer> customers;

    public Branch(String name) {
        this.name = name;
        this.customers = new ArrayList<Customer>();
    }

    public String getName() {
        return name;
    }

    public ArrayList<Customer> getCustomers() {
        return customers;
    }

    public boolean newCustomer(String name, double transaction){
        if (findCustomer(name) == null) {
            this.customers.add(new Customer(name, transaction));
            System.out.println("New customer " + name + " created. First transaction: " + transaction);
            return true;
        }
        System.out.println("Contact is already on file");
        return false;

    }

    public boolean addCustomerTransaction (String name, double transaction){
        if (findCustomer(name) != null) {
            findCustomer(name).addTransaction(transaction);
            System.out.println("Transaction completed. " + name + " added " + transaction);
            return true;
        }
        System.out.println("Customer not found. Transaction cancelled");
        return false;
    }

    private Customer findCustomer(String name){
        for (int i = 0; i < this.customers.size(); i++) {
            Customer customer = this.customers.get(i);
            if (this.customers.get(i).getName().equals(name)) {
                return customer;
            }
        }
        return null;
    }
}
