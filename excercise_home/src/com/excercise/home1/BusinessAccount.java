package com.excercise.home1;


public class BusinessAccount extends BankAccount{

	double maxiDeposit= 100000;

@Override
public String deposit(double amount) {
double maxDeposit = 1000000 ;
if(amount > maxDeposit) {
return "Deposit limit exceeded";
}
else {
double cash = amount +getBankBalance();
setBankBalance(cash)
;
return "Deposit successful";
}

}

public BusinessAccount(double bankBalance) {
	super(bankBalance);
	this.maxiDeposit = maxiDeposit;
}

@Override
public String withdraw(double amount) {
double minBalance = getBankBalance() - 25000;
if(amount > minBalance) {
return "Withdraw limit exceeded";
}else {
double cash =getBankBalance()-amount;
setBankBalance(cash)
;
return "Withdraw successful";
}

}

}