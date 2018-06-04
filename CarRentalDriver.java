/**
 *
 * @author Tom Abraham
 * Period #1
 */
 	/**
	 * This class calls certain methods in a certain order to run the program correctly
	 */
public class CarRentalDriver {
   /**
	 * This method is used to execute the program. It is the main method
	 * @param args is used For passing in the determined values to the variables
	 */
	public static void main(String[] args) {
	   CarRental c1 = new CarRental("Chevrolet", "Suburban", "CPR 607");
		System.out.println(c1.toString2());
		System.out.println(c1.toString());
		CarRental c2 = new CarRental("Honda", "Civic", "RJK 492");
		System.out.println(c2.toString2());
		System.out.println(c2.toString());
		CarRental c3 = new CarRental("Nissan", "Maxima", "SPT 309");
		System.out.println(c3.toString2());
		System.out.println(c3.toString());
	}

		
	}
