package concAssignment;

import concAssignment.Accountsys;

public class Departmentsys {
	public static final int DEPARTMENTS = 10;
    public static final int ACCOUNTS = 50;
    public static final int AMOUNT = 1000;
    public static final int BALANCE = 9000000;
 
    private Accountsys[] account = new Accountsys[ACCOUNTS];
 
    public Departmentsys() {
        for (int i = 0; i < account.length; i++) {
            account[i] = new Accountsys(BALANCE);
        }
    }
 
    public synchronized void transfer(int fromacc, int toacc, int amount) {
        if (amount <= account[fromacc].getBalance()) {
            account[fromacc].withdraw(amount);
            account[toacc].deposit(amount);
 
            String message = "%s transfered %d from %s to %s. Total balance: %d\n";
            String thread = Thread.currentThread().getName();
            System.out.printf(message, thread, amount, fromacc, toacc, getBalance());
            
        }
        else {
        	System.out.println("amount out of range");
        }
    }
 
    public int getBalance() {
        int equal = 0;
 
        for (int i = 0; i < account.length; i++) {
            equal = equal + account[i].getBalance();
        }
 
        return equal;
    }


}
