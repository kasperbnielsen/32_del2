package cdio2_game;

/**
 * This class handles the players and works as the controller between the classes "Game" and "Account". 
 * This includes:
 * Initinating an array with a sum and "m" dice. Initinating a die with "n" sides.
 * Reseting the cup. (Constructor).
 * Rolling a die. (int).
 * Rolling a cup and return the sum of all dice. (int).
 * 
 * Called from the class "Game".
 */

public class Player {
	/**
	 * Establises a empty string for a playername and an account from the account class.
	 */
	private String name;
	private Account account;

	/**
	 * Constructor
	 * Creates players from the establised string "name" and Account "account"
	 * All new players have an account with a balance. The default value is specified in the class "Account".
	 * All new player have a name, which is blank at first, because the player needs to insert a username in the setName method.
	 */
	public Player() {
		account = new Account();
		name = "";
	}

	/**
	 * Method that returns the players name.
	 */
	public String getName() {
		return name;
	}

	/**
	 * Method that calls the "getBalance" method from the class "Account" and returns the current balance.
	 * Necessary to get a low coupling, because Account only have to be called in "Player", instead of in "Player" and "Game".
	 */
	public int getBalance() {
		return account.getBalance();
	}

	/**
	 * Returns the Balance from the class "Account".
	 * Method that calls the "addBalance" method from the class "Account" that adds a value to the current balance.
	 * "addBalance" also runs the method account.balanceCheck.
	 * Necessary to get a low coupling, because Account only have to be called in "Player", instead of in "Player" and "Game".
	 */
	public void addBalance(int value) {
		account.addBalance(value);
	}

	/**
	 * Sets the player's name to the input given by the player.
	 */
	public void setName(String name) {
		this.name = name;
	}
	
	/**
	 * Method that returns true is a player have won the game by having a score of 3000 or more.
	 * otherwise the method returns false.
	 */
	public boolean winner() {
		if (account.getBalance() >= 3000)
			return true;
		else
			return false;
	}
}
