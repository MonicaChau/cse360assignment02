package cse360assignment02;

/**
 * AddingMachine class that performs arithmetic
 * <p>
 * Class also has a total to return and an arithmetic history to print out
 */
public class AddingMachine {
	
	private int total;
	private String history = "0";
	
	/**
	 * AddMachine constructor sets its private variable total to 0
	 */
	public AddingMachine () {
		total = 0;  // not needed - included for clarity
	}
	
	/**
	 * getTotal method returns total of AddingMachine object
	 * 
	 * @return total - the sum of all the previous arithmetic done to AddingMachine object
	 */
	public int getTotal () {
		return total;
	}
	
	/**
	 * add function adds the parameter value to AddingMachine object's total and updates its arithmetic history
	 *  
	 * @param value - the int number added to the object's total
	 */
	public void add (int value) {
		total += value;
		history = history + " + " + value;
	}
	
	/**
	 * subtract function subtracts the parameter value from AddingMachine object's total and updates its arithmetic history
	 *  
	 * @param value - the int number subtracted from the object's total
	 */
	public void subtract (int value) {
		total -= value;
		history = history + " - " + value;
	}
	
	/**
	 * toString method returns the arithmetic history of AddingMachine object
	 * 
	 * @return history - arithmetic history of AddingMachine object
	 */
	public String toString () {
		//System.out.println(history);
		return history;
	}
	
	/**
	 * clear method resets the arithmetic history of AddingMachine object to "0"
	 */
	public void clear() {
		history = "0";
	}
}//end of AddingMachine class