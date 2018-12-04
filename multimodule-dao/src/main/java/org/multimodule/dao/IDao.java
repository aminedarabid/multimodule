package org.multimodule.dao;

import java.util.List;

import org.multimodule.domaine.Adresse;
import org.multimodule.domaine.Personne;
import org.multimodule.domaine.Voiture;


public interface IDao {
	public int ajouterPersonne(Personne p) throws Exception;
	public int supprimerPersonne(Personne p);
	public List<Personne> findAll();
	public int updatePersonne(Personne p, String nom, String prenom, int age);
	
	public int ajouterVoiture(Voiture v, Personne p);
	public int changerProprio(Voiture v, Personne p);
	public int detruireVoiture(Voiture v);
	// méthodes annexes
	public Personne getPersonne(int idPersonne);
	public Voiture getVoiture(int idVoiture);
	//
	public List<Voiture> afficherListeVoitures(Personne p);
	public void updatePersonne(Personne p);
	public void supprimerPersonne(Integer idPers);
	public List<Voiture> findAllVoitures();
	public int ajouterVoiture(Voiture v);
	public int updateVoiture(Voiture v);
	public void detruireVoiture(Integer idVoit);
	
	public int insertAdresse(Adresse a);
	public int updateAdresse(Adresse a, String numRue, String ville, String codePostal);
	public int deleteAdresse(Adresse a);
	public List<Adresse> afficherListeAdresse();
	public List<Adresse> findAllAdresse();
	
}
