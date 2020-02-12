package sait.bms.application;

import sait.bms.managers.*;
import java.io.*;

/**
 * This program demonstrates the BookManagementSystem class's displayMenu method.
 * @author Seulgi Kim, Thai Nguyen
 * @version February 11, 2020	
 */

public class AppDriver {

	public static void main(String[] args) throws IOException {
		// Create a BookManagementSystem instance
		BookManagementSystem bms = new BookManagementSystem();
		
		// call the method to display menu
		bms.displayMenu();
	}

}