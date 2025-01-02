import java.util.ArrayList;

public class Bank{
    
    private static ArrayList<Account> accounts;
  
    public Bank() {
        accounts = new ArrayList<Account>();
    }
    
    public void addAccount(Account account){
        accounts.add(account);
    }

    public void removeAccount(Account account){
        accounts.remove(account);
    }
    
    public void depositMoney(Account account, double money){
        account.depositMoney(money);
    }

    public void withdrawMoney(Account account, double money){
        account.withdrawMoney(money);
    }

    public ArrayList<Account> getAccounts(){
        return accounts;
    }
}
