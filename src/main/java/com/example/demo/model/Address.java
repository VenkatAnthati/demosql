package com.example.demo.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Data;


@Entity
@Data
public class Address implements Serializable {
	
	@Id
	private Integer addId;
	private String addline1;
	private String addline2;
	private String state;
	private String district;
	private Integer postcode;
	
	
	public Address() {
		// TODO Auto-generated constructor stub
	}


	public Address(Integer addId, String addline1, String addline2, String state, String district, Integer postcode) {
		super();
		this.addId = addId;
		this.addline1 = addline1;
		this.addline2 = addline2;
		this.state = state;
		this.district = district;
		this.postcode = postcode;
	}


	public Integer getAddId() {
		return addId;
	}


	public void setAddId(Integer addId) {
		this.addId = addId;
	}


	public String getAddline1() {
		return addline1;
	}


	public void setAddline1(String addline1) {
		this.addline1 = addline1;
	}


	public String getAddline2() {
		return addline2;
	}


	public void setAddline2(String addline2) {
		this.addline2 = addline2;
	}


	public String getState() {
		return state;
	}


	public void setState(String state) {
		this.state = state;
	}


	public String getDistrict() {
		return district;
	}


	public void setDistrict(String district) {
		this.district = district;
	}


	public Integer getPostcode() {
		return postcode;
	}


	public void setPostcode(Integer postcode) {
		this.postcode = postcode;
	}
	
	

}
