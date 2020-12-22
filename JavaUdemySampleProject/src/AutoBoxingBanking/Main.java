package AutoBoxingBanking;

public class Main {
    public static void main(String[] args) {
        Bank bank = new Bank("National Austrlia Bank");
        bank.addBranch("test");
        bank.addCustomer("test", "gautham",50.05);
        bank.addCustomer("test", "greeshma",520.05);
        bank.addCustomer("test", "dharun",150.05);

        bank.addBranch("Sydney");
        bank.addCustomer("Sydney","test",120.04);
        bank.addCustomerTransaction("test","gautham",44.21);
        bank.addCustomerTransaction("test","greeshma",420.30);
        bank.listCustomers("test",true);
        bank.listCustomers("Sydney",true);
    }
}

