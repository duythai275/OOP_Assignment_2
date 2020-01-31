package sait.bms.problemdomain;

public class Paperback extends Book {
	private String authors;
	private int year;
	private char genre;
	
	
	/**
	 * @param iSBN
	 * @param callNumber
	 * @param available
	 * @param total
	 * @param title
	 * @param authors
	 * @param year
	 * @param genre
	 */
	public Paperback(long iSBN, double callNumber, int available, int total, String title, String authors, int year,
			char genre) {
		super(iSBN, callNumber, available, total, title);
		this.authors = authors;
		this.year = year;
		this.genre = genre;
	}
	
	
	/**
	 * @return the authors
	 */
	public String getAuthors() {
		return authors;
	}
	/**
	 * @return the year
	 */
	public int getYear() {
		return year;
	}
	/**
	 * @return the genre
	 */
	public char getGenre() {
		return genre;
	}
	/**
	 * @param authors the authors to set
	 */
	public void setAuthors(String authors) {
		this.authors = authors;
	}
	/**
	 * @param year the year to set
	 */
	public void setYear(int year) {
		this.year = year;
	}
	/**
	 * @param genre the genre to set
	 */
	public void setGenre(char genre) {
		this.genre = genre;
	}


	
	public String toString() {
		return "Paperback [authors=" + authors + ", year=" + year + ", genre=" + genre + "]";
	}
	
	
}
