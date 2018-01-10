package com.mika.beans;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Utilisateur {
	
	private int idUtilisateur;
	private String nomUtilisateur;
	private String emailUtilisateur;
	private String passwordUtilisateur;
	
	@Column(name = "idUtilisateur")
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public int getIdUtilisateur() {
		return idUtilisateur;
	}
	public void setIdUtilisateur(int idUtilisateur) {
		this.idUtilisateur = idUtilisateur;
	}
	public String getNom() {
		return nomUtilisateur;
	}
	public void setNom(String nom) {
		this.nomUtilisateur = nom;
	}
	public String getEmail() {
		return emailUtilisateur;
	}
	public void setEmail(String email) {
		this.emailUtilisateur = email;
	}
	public String getPassword() {
		return passwordUtilisateur;
	}
	public void setPassword(String password) {
		this.passwordUtilisateur = password;
	}
	
	
}
