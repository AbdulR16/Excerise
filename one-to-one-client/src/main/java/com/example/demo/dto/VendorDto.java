package com.example.demo.dto;

import java.io.Serializable;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor
public class VendorDto implements Serializable {

	
	private int vendorId;
	
	
	private String vendorName;
	
	
	private String location;
	
	
	private String service;
}
