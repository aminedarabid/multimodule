package org.multimodule.domaine;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import org.hibernate.validator.constraints.NotEmpty;

@Entity
public class Adresse {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	@NotEmpty
	private String numRue;
	@NotEmpty
	private String ville;
	@NotEmpty
	private String codePostal;
	@OneToMany(mappedBy = "adresse")
	private List<Personne> mesPersonnes;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNumRue() {
		return numRue;
	}
	public void setNumRue(String numRue) {
		this.numRue = numRue;
	}
	public String getVille() {
		return ville;
	}
	public void setVille(String ville) {
		this.ville = ville;
	}
	public String getCodePostal() {
		return codePostal;
	}
	public void setCodePostal(String codePostal) {
		this.codePostal = codePostal;
	}
	public List<Personne> getMesPersonnes() {
		return mesPersonnes;
	}
	public void setMesPersonnes(List<Personne> mesPersonnes) {
		this.mesPersonnes = mesPersonnes;
	}
	public Adresse() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Adresse(String numRue, String ville, String codePostal) {
		super();
		this.numRue = numRue;
		this.ville = ville;
		this.codePostal = codePostal;
	}
	/*
	@Override
	public String toString() {
		return "Adresse [id=" + id + ", numRue=" + numRue + ", ville=" + ville + ", codePostal=" + codePostal
				+ ", mesPersonnes=" + mesPersonnes + "]";
	}
	*/
	
}
