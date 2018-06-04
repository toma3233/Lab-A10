/**
 * 
 * @author Tom Abraham
 * Period #1
 *
 */
import java.util.Scanner;
/**
 * This class employs check protection so that people cannot cash checks fraudulently 
 */
public class CheckProtection {

	private String amount;
	private final int MAX_LENGTH;

	/**
	 * Constructor prompts For the amount, rounds the amount to two decimal
	 * places checks if the amount entered has a length less than MAX_LENGTH If
	 * the amount exceeds the MAX_LENGTH, prints an error message If the amount
	 * is within range prints the check amount with commas and spaces filled
	 * with "*"
	 * 
	 * @param max - max number of spaces
	 */
	public CheckProtection(int max) {
		Scanner scan = new Scanner(System.in);
		MAX_LENGTH = max;
		System.out.print("Enter the check amount: ");
		amount = "" + Math.round(100 * scan.nextDouble()) / 100.0;
		if (amount.length() - amount.indexOf(".") == 2) {
			amount = amount + "0";
		}
		if (amount.length() > MAX_LENGTH) {
			System.out.println("Error: Number doesn't fit in the max amount of spaces.");
		} else {
			printAmount();
		}
	}

	/**
	 * Adds commas to the number recursively
	 * 
	 * @param s - number as a string
	 * @return - number with commas
	 */
	public String addCommas(String s) {
		if (s.indexOf(".") > 0) {
			return addCommas(s.substring(0, s.indexOf("."))) + s.substring(s.indexOf("."), s.length());
		}
		else if (s.length() < 4) {
			return s;
		}
		else {
			return addCommas(s.substring(0, s.length() - 3)) + "," + s.substring(s.length() - 3, s.length());
		}
	}

	/**
	 * Adds the stars to fill in leading spaces recursively
	 * 
	 * @param s - number as a string
	 * @return - number with stars
	 */
	public String addAsterisks(String s) {
		if (s.length() == MAX_LENGTH) {
			return s;
		} 
		else {
			return addAsterisks("*" + s);
		}
	}

	/**
	 * Prints the amount with stars and commas
	 */
	public void printAmount() {
		System.out.println("amount = $" + addAsterisks(addCommas(amount)));
	}
}
