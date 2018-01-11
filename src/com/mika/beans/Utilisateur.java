package com.mika.beans;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "utilisateur")
public class Utilisateur {
	
	private int idUtilisateur;
	private String nomUtilisateur;
	private String emailUtilisateur;
	private String passwordUtilisateur;
	
	@Id
	@Column(name = "idUtilisateur")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public int getIdUtilisateur() {
		return idUtilisateur;
	}
	public void setIdUtilisateur(int idUtilisateur) {
		this.idUtilisateur = idUtilisateur;
	}
	public String getNomUtilisateur() {
		return nomUtilisateur;
	}
	public void setNomUtilisateur(String nom) {
		this.nomUtilisateur = nom;
	}
	public String getEmailUtilisateur() {
		return emailUtilisateur;
	}
	public void setEmailUtilisateur(String email) {
		this.emailUtilisateur = email;
	}
	public String getPasswordUtilisateur() {
		return passwordUtilisateur;
	}
	public void setPasswordUtilisateur(String password) {
		this.passwordUtilisateur = password;
	}
	
	
}
