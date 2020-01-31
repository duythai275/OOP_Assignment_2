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
	public CookBook(long iSBN, double callNumber, int available, int total, String title, String publisher, char diet) {
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
	/**
	 * @param publisher the publisher to set
	 */
	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}
	/**
	 * @param diet the diet to set
	 */
	public void setDiet(char diet) {
		this.diet = diet;
	}
	
	
}
