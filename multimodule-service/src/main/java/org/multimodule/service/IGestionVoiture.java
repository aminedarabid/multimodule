package org.multimodule.service;

import java.util.List;

import org.multimodule.domaine.Personne;
import org.multimodule.domaine.Voiture;


public interface IGestionVoiture {

	public int ajouterVoiture(Voiture v, Personne p);
	public int changerProprio(Voiture v, Personne p);
	public int detruireVoiture(Voiture v);
	public Voiture getVoiture(int idVoiture);
	public List<Voiture> findAllVoitures();
	public int ajouterVoiture(Voiture v);
	public int updateVoiture(Voiture v);
	public void detruireVoiture(Integer idVoit);
}
