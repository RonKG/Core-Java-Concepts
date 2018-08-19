package bank.program;

public class Savings {

	private double balance;

	/**
	 * @param balance
	 */
	public Savings(double balance) {
		super();
		this.balance = balance;
	}

	public Savings() {
		this.balance = 0.0;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public void deposit(double amount) {
		this.balance = balance + amount;
	}

	public void withdraw(double amount) {
		this.balance = balance - amount;
	}
}
