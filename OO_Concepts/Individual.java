package bank.program;

import java.util.ArrayList;

public class Individual extends Account {

	// constructors calling Super()
	public Individual(String accountHolder) {
		super(accountHolder);
	}

	public Individual(String accountHolder, double depToCheck, double depToSav) {
		super(accountHolder, depToCheck, depToSav);
	}

	// main method
	public static void main(String[] args) {
		
		// store objects in ArrayList
		ArrayList<Account> personalAccounts = new ArrayList<Account>();
		
		// Instantiate objects
		personalAccounts.add(new Individual ("Java Master Jose"));
		personalAccounts.add(new Individual ("SQL Master Joy"));
		personalAccounts.add(new Individual ("Abbey George", 22000, 6100));
		personalAccounts.add(new Corporation("Sufian & Mustafa Inc.", 66000000, 450000000));
		personalAccounts.add(new Account    ("Sarah Maina", 80000, 550));
		
		// print objects
		System.out.println(personalAccounts.toString());		
	}
}
