package banking;

public class Account {

	private int balance;
	private String date;
	
	public Account(int ammount) {
		this.balance = ammount;
	}

	public void deposit(int amount) {
		balance += amount;
	}

	public void withdraw(int amount) {
		balance -= amount;
	}

	// public void printStatement()

	public int getBalance() {
		return balance;
	}

	public void setBalance(int amount) {
		this.balance = amount;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}
	
	

}
