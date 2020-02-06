package sait.bms.problemdomain;

public class CookBook extends Book {
	private String publisher;
	private char diet;
	
	/**
	 * @param iSBN
	 * @param callNumber
	 * @param available
	 * @param total
	 * @param title
	 * @param publisher
	 * @param diet
	 */
	public CookBook(long iSBN, String callNumber, int available, int total, String title, String publisher, char diet) {
		super(iSBN, callNumber, available, total, title);
		this.publisher = publisher;
		this.diet = diet;
	}
	
	/**
	 * @return the publisher
	 */
	public String getPublisher() {
		return publisher;
	}
	/**
	 * @return the diet
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
