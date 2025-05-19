package pmt;

import java.util.Scanner;

public class PortfolioApp {

	public static void main(String[] args) {

		String adminEmail = "admin@gmail.com";
		String adminPassword = "admin";

		Scanner scr = new Scanner(System.in);

		System.out.println("1 for Login\n2 For Exit");
		System.out.println("Enter choice");

		int choice = scr.nextInt();

		switch (choice) {
		case 1:
			System.out.println("Enter email and password : ");
			String loginEmail = scr.next();
			String loginPasword = scr.next();

			if (loginEmail.equals(adminEmail) && loginPasword.equals(adminPassword)) {
				//you can perform operation 
				//1 Add Stock | RIL 1450 TATAMOTORS 750 
				//2 List Stock
				//3 Logout 
				
			}

			break;

		default:
			break;
		}

	}
}
