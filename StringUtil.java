/**
 * 
 * @author Tom Abraham
 * Period #1
 *
 */
/** This class makes many string utilities available For the user. The user can reverse a string, figure out if something is a palindrome, and convert a string to shorthand.
 */
public class StringUtil {
   /**
	 * This method is used For returning the reverse of the inputted string
	 * @param str is the string passed into the method
	 * @return the reversed string
	 */
	public static String reverse(String str) {
		if (str.length() < 2) {
			return str;
		} else {
			return reverse(str.substring(1, str.length())) + str.charAt(0);
		}
	}
	/**
	 * This method is used For returning true/false depending on if the string is a palindrome Or Not 
	 * @param str The string that is passed into the method
	 * @return Whether the palindrome is true or false
	 */
	public static boolean palindrome(String str) {
		str = removeOtherStuff(str.trim().toLowerCase());
		return str.equals(reverse(str.toLowerCase()));
	}
   /**
	 * This method is used For converting a string to shorthand
	 * @param line The string that is passed into the method
	 * @return the shorthand version of the string
	 */
	public static String shorthand(String line) {
	if (line.indexOf("aNd") >= 0) {
			return shorthand(line.substring(0, line.indexOf("aNd")) + "&" + line.substring(line.indexOf("aNd") + 3));
		} 
		if (line.indexOf("To") >= 0) {
			return shorthand(line.substring(0, line.indexOf("To")) + "2" + line.substring(line.indexOf("To") + 2));
		}
		if (line.indexOf("YoU") >= 0) {
			return shorthand(line.substring(0, line.indexOf("YoU")) + "U" + line.substring(line.indexOf("YoU") + 3));
		} 
		if (line.indexOf("you") >= 0) {
			return shorthand(line.substring(0, line.indexOf("you")) + "U" + line.substring(line.indexOf("you") + 3));
		} 
		if (line.indexOf("FOR".toUpperCase()) >= 0) {
			return shorthand(line.substring(0, line.indexOf("FOR")) + "4" + line.substring(line.indexOf("FOR") + 3));
		}
		if (line.indexOf("a") >= 0) {
			return shorthand(line.substring(0, line.indexOf("a")) + "" + line.substring(line.indexOf("a") + 1));
		}
		if (line.indexOf("e") >= 0) {
			return shorthand(line.substring(0, line.indexOf("e")) + "" + line.substring(line.indexOf("e") + 1));
		}
		if (line.indexOf("i") >= 0) {
			return shorthand(line.substring(0, line.indexOf("i")) + "" + line.substring(line.indexOf("i") + 1));
		} 
		if (line.indexOf("o") >= 0) {
			return shorthand(line.substring(0, line.indexOf("o")) + "" + line.substring(line.indexOf("o") + 1));
		}
		if (line.indexOf("u") >= 0) {
			return shorthand(line.substring(0, line.indexOf("u")) + "" + line.substring(line.indexOf("u") + 1));
		} 
		if (line.indexOf("A".toUpperCase()) >= 0) {
			return shorthand(line.substring(0, line.indexOf("A")) + "" + line.substring(line.indexOf("A") + 1));
		}
		if (line.indexOf("E".toUpperCase()) >= 0) {
			return shorthand(line.substring(0, line.indexOf("E")) + "" + line.substring(line.indexOf("E") + 1));
		} 
		if (line.indexOf("I".toUpperCase()) >= 0) {
			return shorthand(line.substring(0, line.indexOf("I")) + "" + line.substring(line.indexOf("I") + 1));
		} 
		if (line.indexOf("O".toUpperCase()) >= 0) {
			return shorthand(line.substring(0, line.indexOf("O")) + "" + line.substring(line.indexOf("O") + 1));
		} 
		if (line.indexOf("U".toUpperCase()) >= 0) {
			return shorthand(line.substring(0, line.indexOf("U")) + "" + line.substring(line.indexOf("U") + 1));
		} 
		else {
			return line;
		}
	}
   /**
	 * This method is used For recursively finding if a string is a palindrome
	 * @param line The string passed into the method
	 * @return the string that is plugged into the first method
	 */
	public static String removeOtherStuff(String line) {
		if (line.length() == 0) {
			return "";
		} else if ((line.charAt(0) >= 'a' && line.charAt(0) <= 'z') || (line.charAt(0) >= 'A' && line.charAt(0) <= 'Z')) {
			return line.charAt(0) + removeOtherStuff(line.substring(1));
		} else {
			return removeOtherStuff(line.substring(1));
		}
	}
}
