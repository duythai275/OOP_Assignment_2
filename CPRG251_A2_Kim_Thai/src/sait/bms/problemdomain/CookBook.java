package sait.bms.problemdomain;

public class CookBook extends Book {
	private String publisher;
	private char diet;
	
	/**
	 * @param iSBN The long value is The iSBN of the Book
	 * @param callNumber The integer value is The call number of the Book
	 * @param available The integer value is The number of availability of the Book
	 * @param total The integer value is The total number of the Book
	 * @param title The string value is The title of the Book
	 * @param publisher The string value is The publisher of the Book
	 * @param diet The char value is The diet of the Book
	 */
	public CookBook(long iSBN, String callNumber, int available, int total, String title, String publisher, char diet) {
		super(iSBN, callNumber, available, total, title);
		this.publisher = publisher;
		this.diet = diet;
	}
	
	/**
	 * getPublisher method is a getter of publisher attribute in Book class
	 * @return a value of publisher attribute of a Book object
	 */
	public String getPublisher() {
		return publisher;
	}
	/**
	 * getDiet method is a getter of diet attribute in Book class
	 * @return a value of diet attribute of a Book object
	 */
	public char getDiet() {
		return diet;
	}
	
	public String toString() {
		return 	"ISBN: " + getISBN() + "\n"
			  + "Call Number: " + getCallNumber() + "\n"
			  + "Available: " + getAvailable() + "\n"
			  + "Total: " + getTotal() + "\n"
			  + "Title: " + getTitle() + "\n"
			  + "Publisher: " + getPublisher() + "\n"
			  + "Diet: " + ( (getDiet() == 'D') ? "Diabetic" : (getDiet() == 'V') ? "Vegetarian" : (getDiet() == 'G') ? "Gluten-free" : (getDiet() == 'I') ? "International" : "None" );
	}
}
