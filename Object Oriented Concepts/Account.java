package bank.program;

public class Account {
	// Class variables
	private String accountHolder;
	private static long count = 2018000;
	private long account_Id = 1;
	private static final String BANK = "DE2_BANK";
	private Checkings checkings;
	private Savings savings;

	/**
	 * @param accountHolder
	 * @param accountType
	 * @param checkings
	 * @param savings
	 */

	// loaded constructor
	public Account(String accountHolder, double depositToCheckings, double depositToSavings) {
		super();
		this.accountHolder = accountHolder;
		this.checkings = new Checkings(depositToCheckings);
		this.savings = new Savings(depositToSavings);
		account_Id = count++;
	}

	// empty constructor
	public Account(String accountHolder) {
		this.accountHolder = accountHolder;
		this.checkings = new Checkings();
		this.savings = new Savings();
		account_Id = count++;
	}

	// getters and setters
	public String getAccountHolder() {
		return accountHolder;
	}

	public void setAccountHolder(String accountHolder) {
		this.accountHolder = accountHolder;
	}

	public Checkings getCheckings() {
		return checkings;
	}

	public void setCheckings(Checkings checkings) {
		this.checkings = checkings;
	}

	public Savings getSavings() {
		return this.savings;
	}

	public void setSavings(Savings savings) {
		this.savings = savings;
	}

	// class methods
	public void depositToSavings(double amount) {
		this.savings.deposit(amount);
	}

	public void depositToCheckings(double amount) {
		this.checkings.deposit(amount);
	}

	public double getCheckingsBalance() {
		return this.checkings.getBalance();
	}

	public double getSavingsBalance() {
		return this.savings.getBalance();
	}

	public void transferToSavings(double amount) throws InsufficientBalanceException {

		// check if there is enough funds be4 transfer
		if (amount > checkings.getBalance()) {
			throw new InsufficientBalanceException(
					"Insufficient Funds   <" + numFormatter((amount - (checkings.getBalance()))) + ">");
		} else {

			// withdraw from checking
			checkings.withdraw(amount);
			System.out.println("Hi " + accountHolder + " ");
			System.out.println("you are withdrawing " + numFormatter(amount) + " from Checking");

			// transfer withdrawal to savings
			savings.deposit(amount);
			System.out.println("Success!! You deposited " + numFormatter(amount) + " to Savings");
		}
	}

	// formats number output to 2 decimal

	public void transferToChecking(double amount) throws InsufficientBalanceException {

		if (amount > savings.getBalance()) {
			throw new InsufficientBalanceException(
					"Insufficient Funds  | < " + numFormatter((amount - (savings.getBalance()))) + "");
		} else {

			// withdraw from savings
			savings.withdraw(amount);
			System.out.println("Hi " + accountHolder + " ");
			System.out.println("you are withdrawing " + numFormatter(amount) + " from Savings");

			// transfer withdrawal to checkings
			checkings.deposit(amount);
			System.out.println("Success!! You deposited " + numFormatter(amount) + " to Checking");
		}
	}

	public String numFormatter(double d) {
		return String.format("%.2f", d);
	}

	@Override
	public String toString() {
		return "\n" + "bank name     = " + BANK + "\n" + "accountHolder = " + accountHolder + "\n" + "account ID    = "
				+ account_Id + "\n" + "checkings     = " + numFormatter(checkings.getBalance()) + "\n"
				+ "savings       = " + numFormatter(savings.getBalance()) + "\n";
	}

}
