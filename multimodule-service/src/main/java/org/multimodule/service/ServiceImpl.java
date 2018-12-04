package org.multimodule.service;

import java.util.List;

import org.multimodule.dao.IDao;
import org.multimodule.domaine.Adresse;
import org.multimodule.domaine.Personne;
import org.multimodule.domaine.Voiture;
import org.springframework.transaction.annotation.Transactional;


@Transactional
public class ServiceImpl implements IGestionPersonne, IGestionVoiture, IGestionAdresse {

	private IDao dao;
	
	public IDao getDao() {
		return dao;
	}

	public void setDao(IDao dao) {
		this.dao = dao;
	}

	@Override
	public int ajouterVoiture(Voiture v, Personne p) {
		// TODO Auto-generated method stub
		return dao.ajouterVoiture(v, p);
	}

	@Override
	public int changerProprio(Voiture v, Personne p) {
		// TODO Auto-generated method stub
		return dao.changerProprio(v, p);
	}

	@Override
	public int detruireVoiture(Voiture v) {
		// TODO Auto-generated method stub
		return dao.detruireVoiture(v);
	}

	@Override
	public int ajouterPersonne(Personne p) {
		// TODO Auto-generated method stub
		try {
			return dao.ajouterPersonne(p);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
			return 0;
		}
	}

	@Override
	public int supprimerPersonne(Personne p) {
		// TODO Auto-generated method stub
		return dao.supprimerPersonne(p);
	}

	@Override
	public List<Personne> findAll() {
		// TODO Auto-generated method stub
		return dao.findAll();
	}

	@Override
	public int updatePersonne(Personne p, String nom, String prenom, int age) {
		// TODO Auto-generated method stub
		return dao.updatePersonne(p, nom, prenom, age);
	}

	@Override
	public Personne getPersonne(int idPersonne) {
		// TODO Auto-generated method stub
		return dao.getPersonne(idPersonne);
	}

	@Override
	public Voiture getVoiture(int idVoiture) {
		// TODO Auto-generated method stub
		return dao.getVoiture(idVoiture);
	}

	@Override
	public List<Voiture> afficherListeVoitures(Personne p) {
		// TODO Auto-generated method stub
		return dao.afficherListeVoitures(p);
	}

	@Override
	public void updatePersonne(Personne p) {
		// TODO Auto-generated method stub
		dao.updatePersonne(p);
	}

	@Override
	public void supprimerPersonne(Integer idPers) {
		// TODO Auto-generated method stub
		dao.supprimerPersonne(idPers);
	}

	@Override
	public List<Voiture> findAllVoitures() {
		// TODO Auto-generated method stub
		return dao.findAllVoitures();
	}

	@Override
	public int ajouterVoiture(Voiture v) {
		// TODO Auto-generated method stub
		return dao.ajouterVoiture(v);
	}

	@Override
	public int updateVoiture(Voiture v) {
		// TODO Auto-generated method stub
		return dao.updateVoiture(v);
	}

	@Override
	public void detruireVoiture(Integer idVoit) {
		// TODO Auto-generated method stub
		 dao.detruireVoiture(idVoit);
	}

	@Override
	public int insertAdresse(Adresse a) {
		// TODO Auto-generated method stub
		return dao.insertAdresse(a);
	}

	@Override
	public int updateAdresse(Adresse a, String numRue, String ville, String codePostal) {
		// TODO Auto-generated method stub
		return dao.updateAdresse(a, numRue, ville, codePostal);
	}

	@Override
	public int deleteAdresse(Adresse a) {
		// TODO Auto-generated method stub
		return dao.deleteAdresse(a);
	}

	@Override
	public List<Adresse> afficherListeAdresse() {
		// TODO Auto-generated method stub
		return dao.findAllAdresse();
	}

	@Override
	public List<Adresse> findAllAdresse() {
		// TODO Auto-generated method stub
		return dao.findAllAdresse();
	}

}
