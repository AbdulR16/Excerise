package com.example.demo.dto;

import java.io.Serializable;



import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CompanyDto implements Serializable{
	
	
	private int companyId;
	
	
	private String companyName;
	
	
	private String typeOfBusiness;
	
	
	private VendorDto vendor;
}
