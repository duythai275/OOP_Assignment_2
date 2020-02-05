package sait.bms.problemdomain;

public class Book {
	private long ISBN;
	private double callNumber;
	private int available;
	private int total;
	private String title;
	
	/**
	 * @param iSBN
	 * @param callNumber
	 * @param available
	 * @param total
	 * @param title
	 */
	public Book(long ISBN, double callNumber, int available, int total, String title) {
		this.ISBN = ISBN;
		this.callNumber = callNumber;
		this.available = available;
		this.total = total;
		this.title = title;
	}
	
	/**
	 * @return the iSBN
	 */
	public long getISBN() {
		return ISBN;
	}
	/**
	 * @return the callNumber
	 */
	public double getCallNumber() {
		return callNumber;
	}
	/**
	 * @return the available
	 */
	public int getAvailable() {
		return available;
	}
	/**
	 * @return the total
	 */
	public int getTotal() {
		return total;
	}
	/**
	 * @return the title
	 */
	public String getTitle() {
		return title;
	}

	public String toString() {
		return "Book [ISBN=" + ISBN + ", callNumber=" + callNumber + ", available=" + available + ", total=" + total
				+ ", title=" + title + "]";
	}
}
