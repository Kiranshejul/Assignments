import java.util.*;

class InsufficientFundsException extends Exception {

	  private double balance;

	  public InsufficientFundsException() {

	    System.out.println("Your Balance is Very Low...");

	  }

	 /* public double getBalance() {
	    return balance;
	  }*/

}

public class BankWithdraw {
    private int acctNo;
    private String owner;
    private int balance;

    public BankWithdraw() {
        acctNo = 41;
        owner = "KIRAN";
        balance = 30000;
    }

    public BankWithdraw(int no, String own, int bal) {
        this.acctNo = no;
        this.owner = own;
        this.balance = bal;
    }

    public int getAcctNo() {
        return acctNo;
    }

    public void setAcctNo(int no) {
        this.acctNo = no;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String own) {
        this.owner = own;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int bal) {
        this.balance = bal;
    }

    public void withdraw(int amt) throws InsufficientFundsException {
        if(amt <= balance) {
            balance -= amt;
        }
        else {
            int newBalance = amt - balance;
            throw new InsufficientFundsException();
        }

    }

   /* public void deposit(int amt) {
        this.balance += amt;
    }*/

  /*  public static void main (String args[]) {
    	BankWithdraw ac = new BankWithdraw(41, "KIRAN", 25000);
        try {
            ac.withdraw(15000);
        }catch(InsufficientFundsException e)
        {
            System.out.println("Account number: " +ac.getAcctNo());
            System.out.println("owner: " +ac.getOwner());
            System.out.println("Balance is :" +ac.getBalance() );
        }
    }*/
}
