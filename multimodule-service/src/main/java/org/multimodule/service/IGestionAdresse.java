package org.multimodule.service;

import java.util.List;

import org.multimodule.domaine.Adresse;

public interface IGestionAdresse {

	public int insertAdresse(Adresse a);
	public int updateAdresse(Adresse a, String numRue, String ville, String codePostal);
	public int deleteAdresse(Adresse a);
	public List<Adresse> afficherListeAdresse();
	public List<Adresse> findAllAdresse();
}
