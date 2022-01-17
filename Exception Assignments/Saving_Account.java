import java.util.*;

class InsuficientBalanceException extends Exception {

    String message;
    public InsuficientBalanceException(String message) {
        this.message = message;
    }
    public String toString() {
        return message;
    }
}

class IllegalBankTransactionException extends Exception {

    String msg;
    public IllegalBankTransactionException(String msg) {
        this.msg = msg;
    }
    public String toString() {
        return msg;
    }
}

public class Account {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sca=new Scanner(System.in);
		
		try {
			//Condition A
			System.out.println("Enter ID: ");
			long id=sca.nextLong();
			System.out.println("Enter Balance: ");
			double balance=sca.nextDouble();
			
			System.out.println("Enter deposite Amount: ");
			double deposit=sca.nextDouble();
			System.out.println("Enter withdraw Amount: ");
			double withdraw=sca.nextDouble();
			if(withdraw<=0 || withdraw>balance) {
				throw new InsuficientBalanceException("Insufficient Balance ");
			}
			else if(withdraw<0) {
				throw new IllegalBankTransactionException("Trying to withdraw negative amount");
			}
			else {
				System.out.println("Continue");
			}
		}catch (InsuficientBalanceException e) {
            e.printStackTrace();
        }
		catch (IllegalBankTransactionException ex) {
            ex.printStackTrace();
        }	
	}
}
