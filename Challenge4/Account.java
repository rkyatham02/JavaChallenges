

public class Account{
    
    private String name;
    private String accountNumber;
    private double balance;

    public Account(String name, String accountNumber, double balance){
        this.name = name;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void depositMoney(double money){
        this.balance += money;
    }

    public void withdrawMoney(double money){
        this.balance -= money;
    }

    public String getAccountInfo() {
        return "Name: " + this.name + ", Account Number: " + this.accountNumber + ", Balance: " + this.balance;
    }
}
