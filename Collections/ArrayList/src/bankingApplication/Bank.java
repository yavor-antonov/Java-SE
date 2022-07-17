package bankingApplication;

import java.util.ArrayList;

public class Bank {
   private String name;
   ArrayList<Branch> branches;

   public Bank(String name) {
      this.name = name;
      this.branches = new ArrayList<Branch>();
   }

   public boolean addBranch(String name){
      if (findBranch(name) == null) {
         this.branches.add(new Branch(name));
         System.out.println("New branch " + name + " created.");
         return true;
      }
      System.out.println("Branch is already on file");
      return false;
   }


   public boolean addCustomer(String nameBranch, String nameCustomer, double transaction){
      Branch branch = findBranch(nameBranch);
      if (branch != null) {
         return branch.newCustomer(nameCustomer, transaction);
      }
      System.out.println("Branch not found");
      return false;
   }

   public boolean addCustomerTransaction(String nameBranch, String nameCustomer, double transaction){
      Branch branch = findBranch(nameBranch);
      if (branch!= null) {
         return branch.addCustomerTransaction(nameCustomer, transaction);
      }
      System.out.println("Branch not found. Transaction cancelled");
      return false;
   }

   private Branch findBranch(String name){
      for (int i = 0; i < this.branches.size(); i++) {
         Branch branch = this.branches.get(i);
         if (branch.getName().equals(name)) {
            return branch;
         }
      }
      return null;
   }

   public boolean listCustomers(String branchName, boolean printTransactions)
   {
      Branch branch = findBranch(branchName);
      if (branch != null) {
         System.out.println("Customers details for branch " + branch.getName());
         ArrayList<Customer> branchCustomers = branch.getCustomers();
         for (int i = 0; i < branchCustomers.size(); i++) {
            Customer branchCustomer = branchCustomers.get(i);
            System.out.println("Customer: " + branchCustomer.getName() + "[" + (i+1) + "]");

            if (printTransactions) {
               System.out.println("Transactions");
               ArrayList<Double> transactions = branchCustomer.getTransactions();
               for (int j = 0; j < transactions.size(); j++) {
                  System.out.println("[" + (j+1) + "]" + "  Amount: " + transactions.get(j));
               }
            }
         }
         return true;
      }else{
         System.out.println("Branch not found");
         return false;
      }
   }

}
