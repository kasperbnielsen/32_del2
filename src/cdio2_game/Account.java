package cdio2_game;

/**
 * @author Stonecore
 *
 */
public class Account {
	int balance, defaultBalance = 1000;

	/**
	 * @param args
	 */
	// constructor, sætter spillerens penge til startbeløbet som næmt kan ændres

	public Account(int balance) {
		this.balance = defaultBalance;
		balanceCheck();

	}
	// retunere balancen i kontoen
	public int getBalance() {
		return balance;
	}

	// setPenge tilføjer en int værdi til spilleren penge, hvis slutværdien bliver
	// under 0 ændres den til 0

	public void addToBalance(int Balance) {
		this.balance += balance;
		balanceCheck();
	}

	// sætter penge til 0 hvis den er under 0, kald denne metode efter alle
	// ændringer i en spillers penge
	private void balanceCheck() {
		if (this.balance < 0)
			this.balance = 0;
	}
	
	public String toString() {
		return  balance + "";
	}

}
