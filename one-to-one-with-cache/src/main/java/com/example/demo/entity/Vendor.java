package com.example.demo.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name="abd_vendor_2022")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Vendor implements Serializable {

	@Id
	@Column(name="vendorid")
	private int vendorId;
	
	@Column(name="vendorname")
	private String vendorName;
	
	@Column(name="location")
	private String location;
	
	@Column(name="service")
	private String service;
}
