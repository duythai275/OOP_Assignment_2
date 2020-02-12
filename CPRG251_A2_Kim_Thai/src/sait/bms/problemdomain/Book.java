package sait.bms.problemdomain;

/**
 * The program is a class for identifying "Book" objects
 * 
 * @author Seulgi Kim, Thai Nguyen
 * @version February 11, 2020
 */

public class Book {
	/**
	 * Five private instance fields
	 */
	private long ISBN; //ISBN of the book
	private String callNumber; // Call number of the book
	private int available; // Available number of the book
	private int total; // Total number of the book
	private String title; // Title of the book
	
	/**
	 * The constructor for the Book class
	 * @param iSBN The long value is The iSBN of the Book
	 * @param callNumber The integer value is The call number of the Book
	 * @param available The integer value is The number of availability of the Book
	 * @param total The integer value is The total number of the Book
	 * @param title The string value is The title of the Book
	 */
	public Book(long ISBN, String callNumber, int available, int total, String title) {
		this.ISBN = ISBN;
		this.callNumber = callNumber;
		this.available = available;
		this.total = total;
		this.title = title;
	}
	
	/**
	 * getISBN method is a getter of ISBN attribute in Book class
	 * @return a value of ISBN attribute of a Book object
	 */
	public long getISBN() {
		return ISBN;
	}
	/**
	 * getCallNumber is a getter of callNumber attribute in Book class
	 * @return a value of callNumber attribute of a Book object
	 */
	public String getCallNumber() {
		return callNumber;
	}
	/**
	 * getAvailable is a getter of available attribute in Book class
	 * @return a value of available attribute of a Book object
	 */
	public int getAvailable() {
		return available;
	}
	/**
	 * getTotal is a getter of total attribute in Book class
	 * @return a value of total attribute of a Book object
	 */
	public int getTotal() {
		return total;
	}
	/**
	 * getTitle is a getter of title attribute in Book class
	 * @return a value of title attribute of a Book object
	 */
	public String getTitle() {
		return title;
	}

	public String toString() {
		return "Book [ISBN=" + ISBN + ", callNumber=" + callNumber + ", available=" + available + ", total=" + total
				+ ", title=" + title + "]";
	}
}
