package com.excercise.home1;

public  abstract class  BankAccount  {
	
	private	double bankBalance = 50000;
	public abstract String deposit(double amount);
	public abstract String withdraw(double amount);
	public double getBankBalance() {
		return bankBalance;
	}
	public void setBankBalance(double bankBalance) {
		this.bankBalance = bankBalance;
	}
	public BankAccount(double bankBalance) {
		super();
		this.bankBalance = bankBalance;
	}

	}
	


