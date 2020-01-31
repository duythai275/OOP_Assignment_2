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
	public Book(long iSBN, double callNumber, int available, int total, String title) {
		ISBN = iSBN;
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
	/**
	 * @param iSBN the iSBN to set
	 */
	public void setISBN(long iSBN) {
		ISBN = iSBN;
	}
	/**
	 * @param callNumber the callNumber to set
	 */
	public void setCallNumber(double callNumber) {
		this.callNumber = callNumber;
	}
	/**
	 * @param available the available to set
	 */
	public void setAvailable(int available) {
		this.available = available;
	}
	/**
	 * @param total the total to set
	 */
	public void setTotal(int total) {
		this.total = total;
	}
	/**
	 * @param title the title to set
	 */
	public void setTitle(String title) {
		this.title = title;
	}


	public String toString() {
		return "Book [ISBN=" + ISBN + ", callNumber=" + callNumber + ", available=" + available + ", total=" + total
				+ ", title=" + title + "]";
	}
	
	
}
