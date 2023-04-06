package com.esprit.microservice.clientservice;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Client implements Serializable{
	private static final long serialVersionUID = 6711457437559348053L;
	
	@Id
	@GeneratedValue
	private int id;
	private String nom, prenom,email,address;
	public int getId() {
		return id;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getAddress() {
		return nom;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public Client() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Client(String nom) {
		super();
		this.nom = nom;
	}
	
}
