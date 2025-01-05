package com.traveller.Traveller.entity;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.OneToOne;

@Entity
public class Traveller {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	private String name;
	private String dateOfBirth;
	private long phoneNumber;
	@Column(unique=true)
	public String email;
	
	
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	private  String password;
	@JoinColumn

	@OneToOne(cascade = CascadeType.PERSIST)
	private PassPort passport;
	@ManyToMany(cascade = {CascadeType.PERSIST,CascadeType.MERGE})
	private List<Country> contries;

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDateOfBirth() {
		return dateOfBirth;
	}
	public void setDateOfBirth(String dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
	public long getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(long phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public PassPort getPassport() {
		return passport;
	}
	public void setPassport(PassPort passport) {
		this.passport = passport;
	}
	public List<Country> getContries() {
		return contries;
	}
	public void setContries(List<Country> contries) {
		this.contries = contries;
	}
	
	

}
