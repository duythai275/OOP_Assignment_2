package sait.bms.application;

import sait.bms.managers.*;
import java.io.*;

public class AppDriver {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BookManagementSystem bms = new BookManagementSystem();
		bms.loadBook();
	}

}