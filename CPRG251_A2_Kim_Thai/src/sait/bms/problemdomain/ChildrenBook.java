package sait.bms.problemdomain;

public class ChildrenBook extends Book{
	private String authors;
	private char format;
	
	/**
	 * @param iSBN
	 * @param callNumber
	 * @param available
	 * @param total
	 * @param title
	 * @param authors
	 * @param format
	 */
	public ChildrenBook(long iSBN, String callNumber, int available, int total, String title, String authors,
			char format) {
		super(iSBN, callNumber, available, total, title);
		this.authors = authors;
		this.format = format;
	}
	
	/**
	 * @return the authors
	 */
	public String getAuthors() {
		return authors;
	}
	/**
	 * @return the format
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
