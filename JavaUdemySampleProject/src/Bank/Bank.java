package Bank;

public class Bank {
    private int accountNumber;
    private double balance;
    private String cusomerName;
    private  String email;
    private String phoneNumber;

    public  Bank(int accountNumber, double balance, String cusomerName, String email, String phoneNumber){
        this.balance=balance;
        this.accountNumber = accountNumber;
        this.cusomerName = cusomerName;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }
    public  void depsit(double depositAmount){
        this.balance += depositAmount;
        System.out.println("Deposit of"+ depositAmount+"made New Balance is"+ this.balance);
    }


    public  void withdrawal(double withdrawalAmount){
        if(this.balance-withdrawalAmount<0){
            System.out.println("only"+ this.balance+"available Withdrawal not processed");
        } else{
            this.balance -= withdrawalAmount;
            System.out.println("withdrawal of"+ withdrawalAmount+" processed Remain balance");
        }
    }
    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public String getCusomerName() {
        return cusomerName;
    }

    public void setCusomerName(String cusomerName) {
        this.cusomerName = cusomerName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}
