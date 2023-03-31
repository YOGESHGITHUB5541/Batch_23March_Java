package org.Day_22nd_Encapsulation;
class AccountDetails{
	private int account_number;
	private int account_balance;

    public int getAccountBalance() {
    	return account_balance;
    }
    public void setDeposit(int value) {
    	if(value<0) {
    		System.out.println("Invalid Amount");
    	}else {
    		System.out.println("Amount Deposite");
    	}
    }

}
public class EncapsulationEx3 {
	public static void main(String[] args) {
		AccountDetails obj = new AccountDetails();
		System.out.println(obj.getAccountBalance());
		obj.setDeposit(1000);
		System.out.println("Account Balance after deposite amount is ="+obj.getAccountBalance());


	}

}
