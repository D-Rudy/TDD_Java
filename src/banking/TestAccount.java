package banking;

import static org.junit.Assert.assertTrue;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;

public class TestAccount {

	static Account account;

	@BeforeAll
	static void InitAll() {
		account = new Account(100);
		System.out.println("Balance: " + account.getBalance());
	}

	@Test
	@DisplayName("Retirer de l'argent")
	public void shouldWithdrawAnAmount() {
		account.withdraw(50);
		assertTrue(account.getBalance() == 50);
	}

	@Test
	@DisplayName("Faire un dépot")
	public void shouldDepositAnAmount() {
		account.deposit(100);
		assertTrue(account.getBalance() == 150);
	}
	
	@Test
	@DisplayName("Afficher la console")
	public void shouldDisplayAccountStatement() {
		
	}

	@AfterAll
	static void displayBalance() {
		System.out.println("Balance after: " + account.getBalance());
	}

}
