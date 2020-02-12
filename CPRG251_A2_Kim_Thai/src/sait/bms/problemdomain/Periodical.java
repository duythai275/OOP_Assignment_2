package sait.bms.problemdomain;

/**
 * The program is a class for identifying "Periodical" objects
 * that inherits from "Book"
 * 
 * @author Seulgi Kim, Thai Nguyen
 * @version February 11, 2020
 */
public class Periodical extends Book{
	/**
	 * One private instance field
	 */
	private char frequency; //frequency of Periodical book
	
	/**
	 * The constructor of the Periodical class
	 * @param iSBN The long value is The iSBN of the Book
	 * @param callNumber The integer value is The call number of the Book
	 * @param available The integer value is The number of availability of the Book
	 * @param total The integer value is The total number of the Book
	 * @param title The string value is The title of the Book
	 * @param frequency The char value is The frequency of the Book 
	 */
	public Periodical(long iSBN, String callNumber, int available, int total, String title, char frequency) {
		super(iSBN, callNumber, available, total, title);
		this.frequency = frequency;
	}

	/**
	 * getFrequency method is a getter of frequency attribute in Book class
	 * @return a value of frequency attribute of a Book object
	 */
	public char getFrequency() {
		return frequency;
	}
	/**
	 * toString is used to print information of a Periodical object
	 * by vertical headers
	 */
	public String toString() {
		return 	"ISBN: " + getISBN() + "\n"
			  + "Call Number: " + getCallNumber() + "\n"
			  + "Available: " + getAvailable() + "\n"
			  + "Total: " + getTotal() + "\n"
			  + "Title: " + getTitle() + "\n"
			  + "Frequency: " + ( (getFrequency() == 'D') ? "Daily" : (getFrequency() == 'W') ? "Weekly" : (getFrequency() == 'M') ? "Monthly" : (getFrequency() == 'B') ? "Bimonthly" : "Quarterly" );
	}
	
}
