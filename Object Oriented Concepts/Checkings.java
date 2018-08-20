package bank.program;

public class Checkings {

	private double balance;

	/**
	 * @param balance
	 */
	Checkings(double balance) {
		super();
		this.balance = balance;
	}

	Checkings() {
		this.balance = 0.0;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalalnce(double balance) {
		this.balance = balance;
	}

	public void deposit(double amount) {
		this.balance = balance + amount;
	}

	public void withdraw(double amount) {
		this.balance = balance - amount;
	}
}
