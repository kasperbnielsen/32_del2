package cdio2_game;
/**
 * This class handles the cup and the die/dice in it. 
 * This includes:
 * Initinating an array with a sum and "m" dice. Initinating a die with "n" sides.
 * Reseting the cup. (Constructor).
 * Rolling a die. (int).
 * Rolling a cup and return the sum of all dice. (int).
 * 
 * Called from the class "Game".
 */

public class Cup {
	/**
	 * eyes[] is an array where eyes[1 to eyes.length-1] is a die in a cup. eyes[0] is the total sum of the rolled dice.
	 * sides is the number of sides on every die. The standard die used here is a 6-sided die.
	 */
	private int[] eyes = new int[3];
	private int sides = 6;

	/**
	 * 	Constructor
	 * 
	 */
	public Cup(){
		for (int i = 0; i < eyes.length; i++)
			this.eyes[i] = 0;
	}
	/**
	 * Method that rolls a die and returns the value
	 * (Math.random) gives us a number from 0 to 0.9999999999999...
	 * That number is multiplied with the number of sides on the die, with sides 6 the result ranges from 0 to 5.99999999999994...
	 * 1 is added to that number, the result ranges from 1 to 6.99999999999994...
	 * (int) removes all numbers after the comma, the result can only be 1, 2, 3, 4, 5 and 6.
	 */
	private int Dice() {
		return (int)(Math.random()*sides+1);
	}
	/**
	 * Method that rolls a number of dice and returns the sum of all dice.
	 * eyes[0] is the place in the array that contains the total sum. Set to 0, to wipe previous sum.
	 * In a for-loop all dice are rolled one at a time, and their value is added to the total sum.
	 * The total is then returned.
	 */
	public int rollCup() {
		eyes[0] = 0;
		for(int i = 1; i < eyes.length; i++) {
			eyes[i] = Dice();
			eyes[0] += eyes[i];
		}
		return eyes[0];

	}
	/**
	 * Method that returns the faceupvalue on the die in the eyes["dies"] array .
	 * 0 returns the sum of all die rolls and 1 to eyes.length-1 returns a specific die value.
	 */
	public int getEyes(int dies) {
		return eyes[dies];
	}
	public int getSides() {
		// TODO Auto-generated method stub
		return sides;
	}
}