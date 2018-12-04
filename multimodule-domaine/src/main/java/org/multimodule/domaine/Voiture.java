package org.multimodule.domaine;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Voiture {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int idVoiture;
	private String marque;
	private String constructeur;
	@ManyToOne
	private Personne personne;
	
	public Voiture() {
		super();
	}

	public Voiture(int idVoiture, String marque, String constructeur) {
		super();
		this.idVoiture = idVoiture;
		this.marque = marque;
		this.constructeur = constructeur;
	}

	public int getIdVoiture() {
		return idVoiture;
	}

	public void setIdVoiture(int idVoiture) {
		this.idVoiture = idVoiture;
	}

	public String getMarque() {
		return marque;
	}

	public void setMarque(String marque) {
		this.marque = marque;
	}

	public String getConstructeur() {
		return constructeur;
	}

	public void setConstructeur(String constructeur) {
		this.constructeur = constructeur;
	}

	public Personne getPersonne() {
		return personne;
	}

	public void setPersonne(Personne personne) {
		this.personne = personne;
	}
	
	
}
