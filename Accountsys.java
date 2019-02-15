package concAssignment;

public class Accountsys {
	private int accbBal = 0;
	 
    public Accountsys(int accbBal) {
        this.accbBal = accbBal;
    }
 
    public void withdraw(int amount) {
        this.accbBal = accbBal - amount;
    }
 
    public void deposit(int amount) {
        this.accbBal = accbBal - amount;
    }
 
    public int getBalance() {
        return this.accbBal;
    }
}
