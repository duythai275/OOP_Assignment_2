package sait.bms.problemdomain;

public class Periodical extends Book{
	private char frequency;
	
	/**
	 * @param iSBN
	 * @param callNumber
	 * @param available
	 * @param total
	 * @param title
	 * @param frequency
	 */
	public Periodical(long iSBN, String callNumber, int available, int total, String title, char frequency) {
		super(iSBN, callNumber, available, total, title);
		this.frequency = frequency;
	}

	/**
	 * @return the frequency
	 */
	public char getFrequency() {
		return frequency;
	}
	
	public String toString() {
		return 	"ISBN: " + getISBN() + "\n"
			  + "Call Number: " + getCallNumber() + "\n"
			  + "Available: " + getAvailable() + "\n"
			  + "Total: " + getTotal() + "\n"
			  + "Title: " + getTitle() + "\n"
			  + "Frequency: " + ( (getFrequency() == 'D') ? "Daily" : (getFrequency() == 'W') ? "Weekly" : (getFrequency() == 'M') ? "Monthly" : (getFrequency() == 'B') ? "Bimonthly" : "Quarterly" );
	}
	
}
