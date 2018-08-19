package bank.program;

import java.util.ArrayList;

public class Corporation extends Account {

	// calling super constructors
	public Corporation(String accountHolder) {
		super(accountHolder);
	}

	public Corporation(String accountHolder, double depToCheck, double depToSav) {
		super(accountHolder, depToCheck, depToSav);
	}

	// main method
	public static void main(String[] args) {

		// instantiate objects
		Corporation corp1 = new Corporation("'Cognizant Dallas'", 2000000, 50000000);
		Corporation corp2 = new Corporation("'Cognizant Chicago'", 11, 12);
		Corporation corp3 = new Corporation("'Cognizant New York'");
		Individual   ind1 = new Individual ("'John Tyler'", 50999.469, 2.99);

		// store objects in ArrayList
		ArrayList<Account> accounts = new ArrayList<Account>();
		accounts.add(corp1);
		accounts.add(corp2);
		accounts.add(corp3);
		accounts.add(ind1);

		// print objects
		System.out.println(accounts);

		// transfer from Checking to Savings -- before & after
		System.out.println(ind1.toString());
		try {
			// throws an exception if the funds are not enough 
			// in the originating account
			ind1.transferToSavings(60000);
		} catch (InsufficientBalanceException e) {
			System.out.println("You do not have enough balance in your Account");
			e.printStackTrace();
		} finally {
			System.out.println(ind1.toString());
			ind1.depositToCheckings(78000);
			System.out.println(ind1.toString());
			try {
				ind1.transferToSavings(60000);
			} catch (InsufficientBalanceException e) {
				System.out.println("You do not have enough balance in your Account");
				e.printStackTrace();
			}
			finally {
				System.out.println(ind1.toString());
			}
		}

		// transfer from Savings to Checking -- before & after
		System.out.println(corp1);
		try {
			corp1.transferToChecking(150999);
		} catch (InsufficientBalanceException e) {
			System.out.println("You do not have enough balance in your Account");
			e.printStackTrace();
		} finally {
			System.out.println(corp1);
		}
	}
}
