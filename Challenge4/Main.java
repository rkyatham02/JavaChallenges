
import java.util.ArrayList;

public class Main {
  
  public static void main(String[] args) {
    
    Bank bank = new Bank();

    Account account1 = new Account("Peter Irmgard", "C0011", 5000);
    Account account2 = new Account("Katja Ruedi", "C0121", 4500);
    Account account3 = new Account("Marcella Gebhard", "C0222", 20000);

    bank.addAccount(account1);
    bank.addAccount(account2);
    bank.addAccount(account3);

    ArrayList<Account> accounts = bank.getAccounts();

    for (int i=0; i < accounts.size(); i++) {
      System.out.println(accounts.get(i).getAccountInfo());
    }

    System.out.println("\nAfter depositing 1000 into account1:");
    bank.depositMoney(account1, 1000);

    System.out.println(account1.getAccountInfo());
    System.out.println("No transaction in account2:");
    System.out.println(account2.getAccountInfo());

    System.out.println("After withdrawing 5000 from account3:");
    bank.withdrawMoney(account3, 5000);
    System.out.println(account3.getAccountInfo());
  }
}