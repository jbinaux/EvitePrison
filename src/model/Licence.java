package model;

import java.util.ArrayList;

public class Licence {
	int id;
	String nom;
	String categorie;
	String type;
	ArrayList<String> compatibilite;
	ArrayList<String> droits;
	String description;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getCategorie() {
		return categorie;
	}
	public void setCategorie(String categorie) {
		this.categorie = categorie;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public ArrayList<String> getCompatibilite() {
		return compatibilite;
	}
	public void setCompatibilite(ArrayList<String> compatibilite) {
		this.compatibilite = compatibilite;
	}
	public ArrayList<String> getDroits() {
		return droits;
	}
	public void setDroits(ArrayList<String> droits) {
		this.droits = droits;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	
	
}
