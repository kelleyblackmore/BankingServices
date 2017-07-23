package gui;

import java.util.Scanner;

import models.Account;

public class ATMGUI {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		Account myAccount = new Account("test account", 100);
		
		System.out.printf("Initial name is: %s%n%n", myAccount.getName());
		
		System.out.println("Please enter the name:");
		String theName = input.nextLine();
		myAccount.setName(theName);
		System.out.println();
		System.out.printf("Name in object myAccount is:%n%s%n", myAccount.getName());
		
	}

}
