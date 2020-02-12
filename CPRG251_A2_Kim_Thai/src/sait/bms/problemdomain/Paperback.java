package sait.bms.problemdomain;

/**
 * The program is a class for identifying "Paperback" objects
 * that inherits from "Book"
 * 
 * @author Seulgi Kim, Thai Nguyen
 * @version February 11, 2020
 */
public class Paperback extends Book {
	/**
	 * Three private instance fields
	 */
	private String authors;
	private int year;
	private char genre;
	
	/**
	 * The constructor of the Paperback class
	 * @param iSBN The long value is The iSBN of the Book
	 * @param callNumber The integer value is The call number of the Book
	 * @param available The integer value is The number of availability of the Book
	 * @param total The integer value is The total number of the Book
	 * @param title The string value is The title of the Book
	 * @param authors The string value is The authors of the Book
	 * @param year The integer value is The year of the Book 
	 * @param genre The char value is The year of the Book
	 */
	public Paperback(long iSBN, String callNumber, int available, int total, String title, String authors, int year,
			char genre) {
		super(iSBN, callNumber, available, total, title);
		this.authors = authors;
		this.year = year;
		this.genre = genre;
	}
	
	/**
	 * getAuthors method is a getter of authors attribute in Book class
	 * @return a value of authors attribute of a Book object
	 */
	public String getAuthors() {
		return authors;
	}
	/**
	 * getYear method is a getter of year attribute in Book class
	 * @return a value of year attribute of a Book object
	 */
	public int getYear() {
		return year;
	}
	/**
	 * getGenre method is a getter of genre attribute in Book class
	 * @return a value of genre attribute of a Book object
	 */
	public char getGenre() {
		return genre;
	}
	/**
	 * toString is used to print information of a Paperback object
	 * by vertical headers
	 */
	public String toString() {
		return 	"ISBN: " + getISBN() + "\n"
			  + "Call Number: " + getCallNumber() + "\n"
			  + "Available: " + getAvailable() + "\n"
			  + "Total: " + getTotal() + "\n"
			  + "Title: " + getTitle() + "\n"
			  + "Authors: " + getAuthors() + "\n"
			  + "Year: " + getYear() + "\n"
			  + "Genre: " + ( (getGenre() == 'A') ? "Adventure" : (getGenre() == 'D') ? "Drama" : (getGenre() == 'E') ? "Education" : (getGenre() == 'C') ? "Classic" : (getGenre() == 'F') ? "Fantasy" : "Science Fiction" );
	}
}
