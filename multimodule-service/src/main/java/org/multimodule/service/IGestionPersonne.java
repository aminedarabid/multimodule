package org.multimodule.service;

import java.util.List;

import org.multimodule.domaine.Personne;
import org.multimodule.domaine.Voiture;

public interface IGestionPersonne {
	public int ajouterPersonne(Personne p);
	public int supprimerPersonne(Personne p);
	public List<Personne> findAll();
	public int updatePersonne(Personne p, String nom, String prenom, int age);
	public Personne getPersonne(int idPersonne);
	public List<Voiture> afficherListeVoitures(Personne p);
	public void updatePersonne(Personne p);
	public void supprimerPersonne(Integer idPers);
}
