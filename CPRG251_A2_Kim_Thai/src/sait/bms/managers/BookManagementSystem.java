
package sait.bms.managers;

import sait.bms.problemdomain.*;


import java.util.*;
import java.io.*;

public class BookManagementSystem {
	
	Scanner input = new Scanner(System.in);
	
	// Single list for books
	ArrayList<Book> books = new ArrayList<Book>();

	File file = new File("res/books.txt");
			
	public void displayMenu() throws IOException {
		
		int option = 0;
		
		while (option != 5) {
	
			System.out.println("Welcome in ABC Book Company: How May We Assist You?");
			System.out.println("1	Checkout Book");
			System.out.println("2	Find Books by Title");
			System.out.println("3	Display Books by Type");
			System.out.println("4	Produce Random Book List");
			System.out.println("5	Save & Exit");
			System.out.println();
			System.out.print("Enter option: ");
			option = input.nextInt();
			System.out.println();
			
			switch(option) {
			case 1:
				System.out.print("Enter ISBN of book: ");
				checkBookByIsbn(input.nextLong());
				break;
			case 2: 
				System.out.print("Enter title to search for: ");
				findBookByTitle(input.nextLine());
				break;
			case 3:
				System.out.print("#	Type ");
				System.out.print("1	Children's Books");
				System.out.print("2	Cookbooks");
				System.out.print("3	Paperbacks");
				System.out.print("4	Periodicals");
				System.out.println();
				System.out.print("Enter type of book: ");
				displayBookByType(input.nextInt());
				break;
			case 4:
				System.out.print("Enter number of books: ");
				produceRandomBook(input.nextInt());
				break;
			case 5:
				break;
			}	
			
			System.out.println();
		}
	}
	
	public void checkBookByIsbn (long isbn) {
		for (Book book : books) {
			if (book.getISBN() == isbn) {
				System.out.println("The book " + book.getTitle() + "has been checked out.");
				System.out.println("It can be located using a call number: " + book.getCallNumber());
			}
		}	
	}
		
	public void findBookByTitle (String title) {
		System.out.println ("Matching books: ");
		for (Book book : books) {
			if (book.getTitle() == title) {
				System.out.printf("%s %-20d%n", "ISBN: ", book.getISBN());
				System.out.printf("%s %-20f%n", "Call Number: ", book.getCallNumber());
				System.out.printf("%s %-20d%n", "Available: ", book.getAvailable());
				System.out.printf("%s %-20d%n", "Total: ", book.getTotal());
				System.out.printf("%s %-20s%n", "Title: ", book.getTitle());
//				System.out.printf("%s %-20s%n", "Authors: ", book.getAuthors());
//				System.out.printf("%s %-20s%n", "Format: ", book.getFormat());
				System.out.println();
			}
		}	
	}
		
	public void displayBookByType (int type) {
		System.out.print ("Enter a frequency (D for Daily, W for Weekly, M for Monthly, B for Biweekly, or Q for Quarterly): ");
//		input.nextChar();
		System.out.println ("Matching books: ");
		for (Book book : books) {
//			if (book.getType() == type) {
				System.out.printf("%s %-20d%n", "ISBN: ", book.getISBN());
				System.out.printf("%s %-20f%n", "Call Number: ", book.getCallNumber());
				System.out.printf("%s %-20d%n", "Available: ", book.getAvailable());
				System.out.printf("%s %-20d%n", "Total: ", book.getTotal());
				System.out.printf("%s %-20s%n", "Title: ", book.getTitle());
//				System.out.printf("%s %-20s%n", "Frequency: ", );
				System.out.println();
//			}
		}	
	}
		
	public void produceRandomBook (int numberOfBooks) {
		while (numberOfBooks > 0) {
//			Book book = book.get(new Random().nextInt(books.size()));
			/*System.out.printf("%s %-20d%n", "ISBN: ", book.getISBN());
				System.out.printf("%s %-20f%n", "Call Number: ", book.getCallNumber());
				System.out.printf("%s %-20d%n", "Available: ", book.getAvailable());
				System.out.printf("%s %-20d%n", "Total: ", book.getTotal());
				System.out.printf("%s %-20s%n", "Title: ", book.getTitle());
				System.out.printf("%s %-20s%n", "Authors: ", book.getAuthors());
				System.out.printf("%s %-20d%n", "Year: ", book.getYear());
				System.out.printf("%s %-20s%n", "Genre: ", book.getGenre());*/
				
		}	
	}	
  
  public void loadBook () throws IOException {
		Scanner data = new Scanner(file);
		String line = "";
		while( data.hasNextLine() ) {
			line = data.nextLine();
			String columns[] = line.split(";");
			
			if ( Long.parseLong(columns[0])%10 == 0 || Long.parseLong(columns[0])%10 == 1 ) {
				
			} // else if () {}
		}
		data.close();
	}
}	
