package bank.program;

@SuppressWarnings("serial")

// this is an exception for insufficient funds when doing a money transfer
public class InsufficientBalanceException extends Exception {
	public InsufficientBalanceException(String exceptionMsg) {
		System.out.println("Invalid Amount: " + exceptionMsg);
	}
}
