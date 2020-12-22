package AutoBoxingBanking;

import java.util.ArrayList;

public class Bank {
    private String name;
    private ArrayList<Branch> branches;

    public Bank(String name) {
        this.name = name;
        this.branches = new ArrayList<Branch>();
    }
    public boolean addBranch(String branchName){
        if(findBranch(branchName)==null){
            this.branches.add(new Branch(branchName));
            return true;
        }
        return false;
    }
    public boolean addCustomer(String branchName,String customerName, double initalAmount){
        Branch branch = findBranch(branchName);
        if (branch != null){
            return branch.newCustoemr(customerName, initalAmount);
        }
        return false;
    }
    public boolean addCustomerTransaction(String branchName,String customerName, double amount){
        Branch branch = findBranch(branchName);
        if (branch != null){
            return branch.addCustomerTransaction(customerName,amount);
        }
        return false;
    }
    public Branch findBranch(String branchName){
        for(int i=0; i<this.branches.size();i++){
            Branch checkedBranch = this.branches.get(i);
            if(checkedBranch.getName().equals(branchName)){
                return  checkedBranch;
            }
        }
        return null;
    }

    public boolean listCustomers(String branchName, boolean showTransactions){
        Branch branch = findBranch(branchName);
        if(branch!=null){
            System.out.println("custoemr details for branch"+ branch.getName());
            ArrayList<Customer> branchCustomers = branch.getCustomers();
            for(int i = 0; i<branchCustomers.size();i++){
                System.out.println(branchCustomers.get(i).getName());
                if(showTransactions){
                    System.out.println("Transactions");
                    ArrayList<Double> transactions = branchCustomers.get(i).getTransactions();
                    for(int j = 0;j<transactions.size();j++){
                        System.out.println(transactions.get(j));
                    }
                }
            }
            return true;
        }else {
            return false;
        }
    }
}
