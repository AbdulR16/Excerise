package com.training.model;


import java.io.Serializable;
import java.time.LocalDate;

public class Invoice implements Serializable{ // Serializable is a marked interface
	
	/**
	 * 
	 */
	//private static final long serialVersionUID = 1L;
	private int invoiceNumber;
	private  String customerName; //null
	private double quantity;
	private double ratePerUnit;
	private LocalDate InvoiceDate;
	public Invoice(int invoiceNumber, String customerName, double quantity, double ratePerUnit, LocalDate invoiceDate) {
		super();
		this.invoiceNumber = invoiceNumber;
		this.customerName = customerName;
		this.quantity = quantity;
		this.ratePerUnit = ratePerUnit;
		InvoiceDate = invoiceDate;
	}
	public Invoice() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getInvoiceNumber() {
		return invoiceNumber;
	}
	public void setInvoiceNumber(int invoiceNumber) {
		this.invoiceNumber = invoiceNumber;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public double getQuantity() {
		return quantity;
	}
	public void setQuantity(double quantity) {
		this.quantity = quantity;
	}
	public double getRatePerUnit() {
		return ratePerUnit;
	}
	public void setRatePerUnit(double ratePerUnit) {
		this.ratePerUnit = ratePerUnit;
	}
	public LocalDate getInvoiceDate() {
		return InvoiceDate;
	}
	public void setInvoiceDate(LocalDate invoiceDate) {
		InvoiceDate = invoiceDate;
	}
	
	
	@Override
	public String toString() {
		return invoiceNumber + ","+ customerName+","+ quantity +  "," +ratePerUnit + "," +InvoiceDate + ",";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((InvoiceDate == null) ? 0 : InvoiceDate.hashCode());
		result = prime * result + ((customerName == null) ? 0 : customerName.hashCode());
		result = prime * result + invoiceNumber;
		long temp;
		temp = Double.doubleToLongBits(quantity);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(ratePerUnit);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Invoice other = (Invoice) obj;
		if (InvoiceDate == null) {
			if (other.InvoiceDate != null)
				return false;
		} else if (!InvoiceDate.equals(other.InvoiceDate))
			return false;
		if (customerName == null) {
			if (other.customerName != null)
				return false;
		} else if (!customerName.equals(other.customerName))
			return false;
		if (invoiceNumber != other.invoiceNumber)
			return false;
		if (Double.doubleToLongBits(quantity) != Double.doubleToLongBits(other.quantity))
			return false;
		if (Double.doubleToLongBits(ratePerUnit) != Double.doubleToLongBits(other.ratePerUnit))
			return false;
		return true;
	}
}
