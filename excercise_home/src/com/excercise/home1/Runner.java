package com.excercise.home1;

import java.util.Scanner;

public class Runner {


	public static void main(String[] args) {


	SavingsAccount savings = new SavingsAccount(2000);
	BusinessAccount business = new BusinessAccount(3000);
	boolean checking = true;
	while(checking) {
	

	
	System.out.println("Enter the Account Type");
	System.out.println("enter 1 for savings account (or) enter 2 for business account: ");
	Scanner accountType = new Scanner(System.in);
	int condition = accountType.nextInt();


	switch(condition) {
	case 1:
	System.out.println("enter 1 to deposit (or) enter 2 to withdraw");
	Scanner savingAction = new Scanner(System.in);
	int condition1 = savingAction.nextInt();
	switch(condition1) {


	case 1:
	System.out.println("enter the amount to be deposited: ");
	Scanner deposit = new Scanner(System.in);

	double depositAmount = deposit.nextInt();

	System.out.println(savings.deposit(depositAmount));
	break;

	case 2:
	System.out.println("Enter the amount to be withdrawn: ");
	Scanner withdraw = new Scanner(System.in);

	double withAmount = withdraw.nextInt();

	System.out.println(savings.withdraw(withAmount));

	}
	break;

	case 2:
	System.out.println("enter 1 to deposit else enter 2 to withdraw");
	Scanner busAccAction = new Scanner(System.in);
	int find2 = busAccAction.nextInt();
	switch(find2) {


	case 1:
	System.out.println("enter the amount to be deposited: ");
	Scanner deposit = new Scanner(System.in);

	double depAmount = deposit.nextInt();

	System.out.println(business.deposit(depAmount));
	break;

	case 2:
		System.out.println("Enter the amount to be withdrawn: ");
		Scanner withdraw = new Scanner(System.in);

		double withdrawAmount = withdraw.nextInt();

		System.out.println(business.withdraw(withdrawAmount));

		}
		}
	System.out.println("Do you want to proceed Again");
	Scanner proceed = new Scanner(System.in);
	String check2 = proceed.next();
	switch(check2) {
	case 
	}
		}
		}
}