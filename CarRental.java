/**
 *
 * @author Tom Abraham
 * Period #1
 */
/** The class CarRental is used For converting a car's license plate into an ID used For various purposes
 */
public class CarRental {
	private String make;
	private String model;
	private String licensePlate;

   	/**
	 * This is a constructor, and it is used For initializing the instance variables.
	 * @param make is what is passed in For the make of the car.
	 * @param model is what is passed in For the model of the car.
	 * @param licensePlate is what is passed in For the license plate of the car.
	 */
	public CarRental(String make, String model, String licensePlate) {
		this.make = make;
		this.model = model;
		this.licensePlate = licensePlate;
	}
   	/**
	 * This method basically Does all the calculations required For computing the code
	 * @return The final code with a letter and three digit integer.
	 */
	public String computeCode() {
		int firstNumber = licensePlate.charAt(0) + licensePlate.charAt(1) + licensePlate.charAt(2);
		int secondNumber = ((licensePlate.charAt(4) - '0') * 100) + ((licensePlate.charAt(5) - '0') * 10) + (licensePlate.charAt(6) - '0');
				
		int numberPart = firstNumber + secondNumber;
		int whichLetter = numberPart % 26;
		char letterPart = (char) (65 + whichLetter);
		return letterPart + "" + numberPart;
	}

   	/**
	 * This is a getter method to access the current code
	 * @return The current code
	 */
	public String getCode() {
		return computeCode();
	}
   	/**
	 * This method is used For Formatting the output so that it comes out in a specific Format
	 * @return The Formatted output
	 */
	public String toString() {
		return "Make = " + make + "\nModel = " + model + "\n" + licensePlate + " = " + getCode();
	}
		/**
	 * This method is used For Formatting the output so that it comes out in a different specific Format
	 * @return Another Formatted output
	 */
	public String toString2() {
		return "Make: " + make + "\nModel: " + model + "\n" + "License Plate: " + licensePlate;
	}

	
}
