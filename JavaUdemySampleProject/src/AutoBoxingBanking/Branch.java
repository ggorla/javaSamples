package AutoBoxingBanking;

import java.util.ArrayList;

public class Branch {
    private  String name;
    private ArrayList<Customer> customers;

    public Branch(String name) {
        this.name = name;
        this.customers = new ArrayList<Customer>();
    }
    public  String getName(){
        return name;
    }

    public ArrayList<Customer> getCustomers() {
        return customers;
    }

    public boolean newCustoemr(String customerName, double initalAmount){
        if (findCustomer(customerName)==null ){
             this.customers.add(new Customer( customerName, initalAmount));
             return true;
        }
        return  false;
    }
    public boolean addCustomerTransaction(String customerName, double amount){
        Customer exitingCustoemr = findCustomer(customerName);
         if(exitingCustoemr!= null){
             exitingCustoemr.addTransaction(amount);
            return true;
        }
         return false;
    }

 private Customer findCustomer(String queryCustomer){
        for(int i=0;i<customers.size();i++){
            if(customers.get(i).getName()== queryCustomer){
                return customers.get(i);
            }
        }
        return null;
 }
}
