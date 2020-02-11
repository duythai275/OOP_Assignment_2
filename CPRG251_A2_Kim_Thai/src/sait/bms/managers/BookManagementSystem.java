package sait.bms.managers;

import sait.bms.problemdomain.*;

import java.util.*;
import java.io.*;

public class BookManagementSystem {
	
	Scanner input = new Scanner(System.in);
	
	// Single list for books
	ArrayList<Book> books = new ArrayList<Book>();
	
	File file;
	
	public BookManagementSystem() {
		System.out.print("Please enter the data file's path: ");
		file = new File(input.nextLine());
//		file = new File("res/books.txt");
	}

	
			
	public void displayMenu() throws IOException {
		
		loadBook();
		
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
				input.nextLine();
				findBookByTitle(input.nextLine());
				break;
			case 3:
				System.out.println("#	Type ");
				System.out.println("1	Children's Books");
				System.out.println("2	Cookbooks");
				System.out.println("3	Paperbacks");
				System.out.println("4	Periodicals");
				System.out.println();
				System.out.print("Enter type of book: ");
				displayBookByType(input.nextInt());
				break;
			case 4:
				System.out.print("Enter number of books: ");
				produceRandomBook(input.nextInt());
				break;
			case 5:
				System.out.println("Closing ...");
				PrintWriter output = new PrintWriter(file);
				for ( Book b : books ) {
					if ( ( b.getISBN()%10 ) == 0 || ( b.getISBN()%10 ) == 1 ) output.println(b.getISBN()+";"+b.getCallNumber()+";"+b.getAvailable()+";"+b.getTotal()+";"+b.getTitle()+";"+((ChildrenBook) b).getAuthors()+";"+((ChildrenBook) b).getFormat());
					else if ( ( b.getISBN()%10 ) == 2 || ( b.getISBN()%10 ) == 3 ) output.println(b.getISBN()+";"+b.getCallNumber()+";"+b.getAvailable()+";"+b.getTotal()+";"+b.getTitle()+";"+((CookBook) b).getPublisher()+";"+((CookBook) b).getDiet());
					else if ( ( b.getISBN()%10 ) == 8 || ( b.getISBN()%10 ) == 9 ) output.println(b.getISBN()+";"+b.getCallNumber()+";"+b.getAvailable()+";"+b.getTotal()+";"+b.getTitle()+";"+((Periodical) b).getFrequency());
					else output.println(b.getISBN()+";"+b.getCallNumber()+";"+b.getAvailable()+";"+b.getTotal()+";"+b.getTitle()+";"+((Paperback) b).getAuthors()+";"+((Paperback) b).getYear()+";"+((Paperback) b).getGenre());
				}
				output.close();
				break;
			default:
				System.out.println("Please select options from 1 to 5");
			}	
			
			System.out.println();
		}
	}
	
	public void checkBookByIsbn (long isbn) {
		while ( Long.toString(isbn).length() != 13 ) {
			System.out.println("Please type 13 digits only");
			System.out.print("Enter ISBN of book: ");
			isbn = input.nextLong();
		} 
		
		for (Book book : books) {
			if (book.getISBN() == isbn) {
				System.out.println("The book \"" + book.getTitle() + "\" has been checked out.");
				System.out.println("It can be located using a call number: " + book.getCallNumber());
			}
		}
	}
		
	public void findBookByTitle (String title) {
		System.out.println ("Matching books: ");
		for (Book book : books) {
			if ( book.getTitle().toLowerCase().contains(title.toLowerCase()) ) {
				System.out.println(book);
				System.out.println();
			}
		}	
	}
		
	public void displayBookByType (int type) {
		String category;
		while ( type < 1 || type > 4 ) {
			System.out.println("Please enter option from 1 to 4");
			System.out.print("Enter type of book: ");
			type = input.nextInt();
		}
		
		switch(type) {
			case 1: 
				System.out.println("Enter the Format (P for Picture book, E for Early Readers, or C for Chapter book): ");
				input.nextLine();
				category = input.nextLine();
				while ( category.length() > 1 || ( category.charAt(0) != 'P' && category.charAt(0) != 'E' && category.charAt(0) != 'C' ) ) { 
					if ( category.length() > 1 ) {
						System.out.println("Please enter 1 character only");
					} else {
						System.out.println("Wrong format. Please enter again: ");
					}
					System.out.println("Enter the Format (P for Picture book, E for Early Readers, or C for Chapter book): ");
					category = input.nextLine();
				}
				for ( Book p : books ) {
					if ( (p.getISBN()%10) == 0 || (p.getISBN()%10) == 1 ) {
						if ( ((ChildrenBook) p).getFormat() == category.charAt(0) ) {
							System.out.println(p);
							System.out.println();
						}
					}
				}
				break;
			case 2:
				System.out.println("Enter the Diet (D for Diabetic, V for Vegetarian, G for Gluten-free, I for International, or N for None): ");
				input.nextLine();
				category = input.nextLine();
				while ( category.length() > 1 || ( category.charAt(0) != 'D' && category.charAt(0) != 'V' && category.charAt(0) != 'G' && category.charAt(0) != 'I' && category.charAt(0) != 'N' ) ) { 
					if ( category.length() > 1 ) {
						System.out.println("Please enter 1 character only");
					} else {
						System.out.println("Wrong format. Please enter again: ");
					}
					System.out.println("Enter the Diet (D for Diabetic, V for Vegetarian, G for Gluten-free, I for International, or N for None): ");
					category = input.nextLine();
				}
				for ( Book p : books ) {
					if ( (p.getISBN()%10) == 2 || (p.getISBN()%10) == 3 ) {
						if ( ((CookBook) p).getDiet() == category.charAt(0) ) {
							System.out.println(p);
							System.out.println();
						}
					}
				}
				break;
			case 3: 
				System.out.println("Enter the Genre (A for Adventure, D for Drama, E for Education, C for Classic, F for Fantasy, or S for Science Fiction): ");
				input.nextLine();
				category = input.nextLine();
				while ( category.length() > 1 || ( category.charAt(0) != 'A' && category.charAt(0) != 'D' && category.charAt(0) != 'E' && category.charAt(0) != 'C' && category.charAt(0) != 'F' && category.charAt(0) != 'S' ) ) { 
					if ( category.length() > 1 ) {
						System.out.println("Please enter 1 character only");
					} else {
						System.out.println("Wrong format. Please enter again: ");
					}
					System.out.println("Enter the Genre (A for Adventure, D for Drama, E for Education, C for Classic, F for Fantasy, or S for Science Fiction): ");
					category = input.nextLine();
				}
				for ( Book p : books ) {
					if ( (p.getISBN()%10) == 4 || (p.getISBN()%10) == 5 || (p.getISBN()%10) == 6 || (p.getISBN()%10) == 7 ) {
						if ( ((Paperback) p).getGenre() == category.charAt(0) ) {
							System.out.println(p);
							System.out.println();
						}
					}
				}
				break;
			case 4: 
				System.out.println("Enter the Frequency (D for Daily, W for Weekly, M for Monthly, B for Biweekly, or Q for Quarterly): ");
				input.nextLine();
				category = input.nextLine();
				while ( category.length() > 1 || ( category.charAt(0) != 'D' && category.charAt(0) != 'W' && category.charAt(0) != 'M' && category.charAt(0) != 'B' && category.charAt(0) != 'Q' ) ) { 
					if ( category.length() > 1 ) {
						System.out.println("Please enter 1 character only");
					} else {
						System.out.println("Wrong format. Please enter again: ");
					}
					System.out.println("Enter the Frequency (D for Daily, W for Weekly, M for Monthly, B for Biweekly, or Q for Quarterly): ");
					category = input.nextLine();
				}
				for ( Book p : books ) {
					if ( (p.getISBN()%10) == 8 || (p.getISBN()%10) == 9 ) {
						if ( ((Periodical) p).getFrequency() == category.charAt(0) ) {
							System.out.println(p);
							System.out.println();
						}
					}
				}
				break;
			default:
				System.out.println("Please select options from 1 to 4");
		}
	}
		
	public void produceRandomBook (int numberOfBooks) {
		while (numberOfBooks > 0) {
			System.out.println( books.get(new Random().nextInt(books.size())) );	
			System.out.println();
			numberOfBooks--;
		}	
	}	
  
	public void loadBook() throws IOException {
		Scanner data = new Scanner(file); // read the text file
		String line = "";
		while( data.hasNextLine() ) {
			line = data.nextLine();
			String columns[] = line.split(";");
			int type = (int) (Long.parseLong(columns[0])%10);
			
			if ( type == 0 || type == 1 ) {
				books.add(
					new ChildrenBook(
						Long.parseLong(columns[0]),
						columns[1],
						Integer.parseInt(columns[2]),
						Integer.parseInt(columns[3]),
						columns[4],
						columns[5],
						columns[6].charAt(0)
					)
				);
			} 
			else if ( type == 2 || type == 3 ) {
				books.add(
					new CookBook(
						Long.parseLong(columns[0]),
						columns[1],
						Integer.parseInt(columns[2]),
						Integer.parseInt(columns[3]),
						columns[4],
						columns[5],
						columns[6].charAt(0)
					)
				);
			}
			else if (type == 8 || type == 9 ) {
				books.add(
					new Periodical(
						Long.parseLong(columns[0]),
						columns[1],
						Integer.parseInt(columns[2]),
						Integer.parseInt(columns[3]),
						columns[4],
						columns[5].charAt(0)
					)
				);
			}
			else {
				books.add(
					new Paperback(
						Long.parseLong(columns[0]),
						columns[1],
						Integer.parseInt(columns[2]),
						Integer.parseInt(columns[3]),
						columns[4],
						columns[5],
						Integer.parseInt(columns[6]),
						columns[7].charAt(0)
					)
				);
			}
			
		}
		data.close();
	}
}	
