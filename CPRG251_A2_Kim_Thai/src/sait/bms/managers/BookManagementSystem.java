package sait.bms.managers;

import sait.bms.problemdomain.*;
import java.util.*;
import java.io.*;

public class BookManagementSystem {
	
	// Single list for books
	ArrayList<Book> books = new ArrayList<Book>();
	
	File file = new File("res/books.txt");
	
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
 