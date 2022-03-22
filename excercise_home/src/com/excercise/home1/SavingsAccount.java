package com.excercise.home1;



public class SavingsAccount extends BankAccount{
	
	double maxiDeposit= 100000;
	
	


public SavingsAccount(double bankBalance) {
		super(bankBalance);
	}

@Override
public String deposit(double amount) {

double maxDeposit = 100000 ;
if(amount > maxDeposit) {
return "Deposit limit exceeded";
}
else {
double cash = amount + getBankBalance();
setBankBalance(cash)
;
return "Deposit successful";
}

}

@Override
public String withdraw(double amount) {

double minBalance = getBankBalance() - 5000;
if(amount > minBalance) {
return "Withdraw limit exceeded";
}else {
double cash = getBankBalance()-amount;
setBankBalance(cash)
;
return "Withdraw successful";
}

}

}