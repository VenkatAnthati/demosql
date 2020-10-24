package com.example.demo.model;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

import lombok.Data;

@Entity
@Data
public class Student implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer stdId;
	private String name;
	private String fathername;
	private String surname;
	private String cource;
	private String phnumber;

	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "Addr_Id", referencedColumnName = "addId", nullable = true)
	private Address addrId;

	public Student() {
		// TODO Auto-generated constructor stub
	}

	public Student(Integer stdId, String name, String fathername, String surname, Address addrId) {
		super();
		this.stdId = stdId;
		this.name = name;
		this.fathername = fathername;
		this.surname = surname;
		this.addrId = addrId;
	}

	public Integer getStdId() {
		return stdId;
	}

	public void setStdId(Integer stdId) {
		this.stdId = stdId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getFathername() {
		return fathername;
	}

	public void setFathername(String fathername) {
		this.fathername = fathername;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public Address getAddrId() {
		return addrId;
	}

	public void setAddrId(Address addrId) {
		this.addrId = addrId;
	}

	public String getCource() {
		return cource;
	}

	public void setCource(String cource) {
		this.cource = cource;
	}

	public String getPhnumber() {
		return phnumber;
	}

	public void setPhnumber(String phnumber) {
		this.phnumber = phnumber;
	}

}
