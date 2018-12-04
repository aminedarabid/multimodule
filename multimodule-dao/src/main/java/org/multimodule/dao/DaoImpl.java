package org.multimodule.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.multimodule.domaine.Adresse;
import org.multimodule.domaine.Personne;
import org.multimodule.domaine.Voiture;


public class DaoImpl implements IDao {
	
	@PersistenceContext
	private EntityManager em;
	@Override
	public int ajouterPersonne(Personne p) throws Exception {
		em.persist(p);
		return p.getId();
	}

	@Override
	public int supprimerPersonne(Personne p) {
		// TODO Auto-generated method stub
		em.remove(p);
		return p.getId();
	}

	@Override
	public List<Personne> findAll() {
		// TODO Auto-generated method stub
		Query req=em.createQuery("select p from Personne p");
		return req.getResultList();
	}

	@Override
	public int updatePersonne(Personne p, String nom, String prenom, int age) {
		// TODO Auto-generated method stub
		p.setNom(nom);
		p.setPrenom(prenom);
		p.setAge(age);
		em.merge(p);
		return p.getId();
	}

	@Override
	public int ajouterVoiture(Voiture v, Personne p) {
		// TODO Auto-generated method stub
		v.setPersonne(p);
		em.persist(v);
		return v.getIdVoiture();
	}

	@Override
	public int changerProprio(Voiture v, Personne p) {
		// TODO Auto-generated method stub
		v.setPersonne(p);
		em.merge(v);
		return v.getIdVoiture();
	}

	@Override
	public int detruireVoiture(Voiture v) {
		// TODO Auto-generated method stub
		em.remove(v);
		return v.getIdVoiture();
	}

	@Override
	public Personne getPersonne(int idPersonne) {
		// TODO Auto-generated method stub
		return em.find(Personne.class, idPersonne);
	}

	@Override
	public Voiture getVoiture(int idVoiture) {
		// TODO Auto-generated method stub
		return em.find(Voiture.class, idVoiture);
	}

	@Override
	public List<Voiture> afficherListeVoitures(Personne p) {
		Query req=em.createQuery("select v from Voiture v where v.personne.id=?");
		req.setParameter(1, p.getId());
		return req.getResultList();
	}

	@Override
	public void updatePersonne(Personne p) {
		// TODO Auto-generated method stub
		em.merge(p);
	}

	@Override
	public void supprimerPersonne(Integer idPers) {
		// TODO Auto-generated method stub
		em.remove(em.find(Personne.class, idPers));
	}

	@Override
	public List<Voiture> findAllVoitures() {
		// TODO Auto-generated method stub
				Query req=em.createQuery("select v from Voiture v");
				return req.getResultList();
	}

	@Override
	public int ajouterVoiture(Voiture v) {
		// TODO Auto-generated method stub
		em.persist(v);
		return v.getIdVoiture();
	}

	@Override
	public int updateVoiture(Voiture v) {
		em.merge(v);
		return v.getIdVoiture();
	}

	@Override
	public void detruireVoiture(Integer idVoit) {
		// TODO Auto-generated method stub
		em.remove(em.find(Voiture.class,idVoit));
	}

	@Override
	public int insertAdresse(Adresse a) {
		// TODO Auto-generated method stub
		em.persist(a);
		return a.getId();
	}

	@Override
	public int updateAdresse(Adresse a, String numRue, String ville, String codePostal) {
		// TODO Auto-generated method stub
		a.setNumRue(numRue);
		a.setVille(ville);
		a.setCodePostal(codePostal);
		em.merge(a);
		return a.getId();
	}

	@Override
	public int deleteAdresse(Adresse a) {
		// TODO Auto-generated method stub
		em.remove(a);
		return a.getId();
	}

	@Override
	public List<Adresse> afficherListeAdresse() {
		// TODO Auto-generated method stub
		Query req=em.createQuery("select a from Adresse a");
	
		return req.getResultList();
	}

	@Override
	public List<Adresse> findAllAdresse() {
		Query req=em.createQuery("select a from Adresse a");
		return req.getResultList();
	}
	
}
