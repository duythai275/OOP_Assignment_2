package sait.bms.problemdomain;

public class ChildrenBook extends Book{
	private String authors;
	private char format;
	
	/**
	 * @param iSBN The long value is The iSBN of the Book
	 * @param callNumber The integer value is The call number of the Book
	 * @param available The integer value is The number of availability of the Book
	 * @param total The integer value is The total number of the Book
	 * @param title The string value is The title of the Book
	 * @param authors The string value is The authors of the Book
	 * @param format The char value is The format of the Book
	 */
	public ChildrenBook(long iSBN, String callNumber, int available, int total, String title, String authors,
			char format) {
		super(iSBN, callNumber, available, total, title);
		this.authors = authors;
		this.format = format;
	}
	
	/**
	 * getAuthors method is a getter of authors attribute in Book class
	 * @return a value of authors attribute of a Book object
	 */
	public String getAuthors() {
		return authors;
	}
	/**
	 * getFormat method is a getter of format attribute in Book class
	 * @return a value of format attribute of a Book object
	 */
	public char getFormat() {
		return format;
	}

	public String toString() {
		return 	"ISBN: " + getISBN() + "\n"
			  + "Call Number: " + getCallNumber() + "\n"
			  + "Available: " + getAvailable() + "\n"
			  + "Total: " + getTotal() + "\n"
			  + "Title: " + getTitle() + "\n"
			  + "Authors: " + getAuthors() + "\n"
			  + "Format: " + ( ( getFormat() == 'P' ) ? "Picture book" : ( getFormat() == 'E' ) ? "Early Readers" : "Chapter book" );
	}
}
