package com.traveller.Traveller.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;

@Entity
public class PassPort {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	private String passPortNumber;
	private String nationality;
	private String gender;
	private String dateOfIssue;
	private String dateOfExpiry;
	@JsonIgnore
	@OneToOne(mappedBy="passport")
	private Traveller traveller;
	public int getId() {
		return id;
	}

	public String getPassPortNumber() {
		return passPortNumber;
	}
	public void setPassPortNumber(String passPortNumber) {
		this.passPortNumber = passPortNumber;
	}
	public String getNationality() {
		return nationality;
	}
	public void setNationality(String nationality) {
		this.nationality = nationality;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getDateOfIssue() {
		return dateOfIssue;
	}
	public void setDateOfIssue(String dateOfIssue) {
		this.dateOfIssue = dateOfIssue;
	}
	public String getDateOfExpiry() {
		return dateOfExpiry;
	}
	public void setDateOfExpiry(String dateOfExpiry) {
		this.dateOfExpiry = dateOfExpiry;
	}
	public Traveller getTraveller() {
		return traveller;
	}
	public void setTraveller(Traveller traveller) {
		this.traveller = traveller;
	}
	
	
}
